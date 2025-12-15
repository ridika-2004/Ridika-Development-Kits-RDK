from sqlmodel import create_engine, Session

# create_engine = Creates a connection factory to your database
# Knows:
# Which database (SQLite, PostgreSQL, MySQL)
# Where it is
# How to talk to it

# Session = Represents an actual conversation with the database
# CRUD operation in DB

DATABASE_URL = 'sqlite:///database.db'

# A manager
engine = create_engine(
    DATABASE_URL,
    echo=True # shows SQL queries (useful for learning) In production → usually echo=False
)

# This function exists for FastAPI dependency injection.
def get_session():
    with Session(engine) as session:
        yield session   # receive a valid Session object