public abstract class User {
    protected Mediator mediator;
    protected String name;

    User(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract void send(String msg, User receiver);
    abstract void receive(String msg);
    abstract void sendToAll(String msg);
}
