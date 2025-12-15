from sqlmodel import SQLModel, Field
from typing import Optional


class User(SQLModel, table=True):
    # If you remove table=True, TNo table is created. Can be used for request validation
    # Very useful for = UserCreate, UserUpdate
    id: Optional[int] = Field(default=None,primary_key=True) # Optional[int] controls type, default=None controls whether the client must send it.
    name : str
    email : str

    # if we write table=True, it becomes
    # CREATE TABLE user (
    #     id INTEGER PRIMARY KEY,
    #     name TEXT NOT NULL,
    #     email TEXT NOT NULL
    # );

class UserUpdate(SQLModel):
    name : Optional[str] = None # Client can send {} or partial fields, and validation will pass
    email : Optional[str] = None 
