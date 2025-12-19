public class TeacherUser extends User {
    TeacherUser(Mediator m, String name) {
        super(m, name);
    }

    @Override
    void send(String msg, User receiver) {
        mediator.sendMessage(msg, this, receiver);
    }

    void sendToAll(String msg) {
        mediator.broadcastMessage(msg, this);
    }

    void receive(String msg) {
        System.out.println("Teacher received : " + msg);
    }
}
