import java.util.*;

public class ClassroomMediator implements Mediator {
    private List<User> users = new ArrayList<>();

    void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(String msg, User sender, User receiver) {
        receiver.receive(sender.name + ": " + msg);
    }

    public void broadcastMessage(String msg, User sender) {
        for (User u : users) {
            if (u != sender) {
                u.receive(sender.name + ": " + msg);
            }
        }
    }
}