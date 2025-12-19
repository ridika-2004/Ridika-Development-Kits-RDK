public interface Mediator {
    void sendMessage(String msg, User sender, User receiver);
    void broadcastMessage(String msg, User user);
}