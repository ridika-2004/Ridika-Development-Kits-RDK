from fastapi import FastAPI, Depends, HTTPException
from database import get_session, engine
from models import User, UserUpdate
from sqlmodel import Session, select, SQLModel

# Session used for:
# Editor autocomplete
# Validation
# Documentation

app = FastAPI()

@app.on_event("startup") # Run this function once, when the application starts
# Startup = right after the server starts, before handling any requests
def startup():
    # SQLModel.metadata → collects all models with table=True
    SQLModel.metadata.create_all(engine) # Go through all registered tables and create them in the database if they don’t exist yet

@app.post("/users")
def create_user(user:User, session:Session=Depends(get_session)): # get_session creates a api session for me
    # add fields in db
    session.add(user)
    session.commit()
    session.refresh(user)
    return user

@app.get("/users")
def get_user(session:Session=Depends(get_session)):
    users = session.exec(select(User)).all()
    return users

@app.patch("/users/{user_id}")
def update_user(id : int, userUpdated : UserUpdate, session:Session=Depends(get_session)):
    user = session.get(User, id)
    if not user:
        raise HTTPException(status_code=404, detail="User doesn't exist")
    
    if userUpdated.name is not None:
        user.name = userUpdated.name

    if userUpdated.email is not None:
        user.email = userUpdated.email

    session.add(user) # optional but safe
    session.commit()
    session.refresh(user)
    return user

@app.delete("/users/{user_id}")
def delete_user(id : int, session:Session=Depends(get_session)):
    user = session.get(User, id)
    if not user:
        raise HTTPException(status_code=404, detail="User doesn't exist")
    
    session.delete(user)
    session.commit()

    return {f"id {id} deleted succesfully"}
