public interface IAnnouncement {
    void postAnnouncement(String msg);
    void subscribe(Observer o);
    void unsubscribe(Observer o);
}
