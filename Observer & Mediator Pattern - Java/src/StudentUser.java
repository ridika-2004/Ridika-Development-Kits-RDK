public class StudentUser extends User {
    StudentUser(Mediator m, String name) {
        super(m, name);
    }

    @Override
    void send(String msg, User receiver) {
        mediator.sendMessage(msg, this, receiver);
    }

    void receive(String msg) {
        System.out.println(name + " got message : " + msg);
    }

    void sendToAll(String msg) {
        mediator.broadcastMessage(msg, this);
    }
}
