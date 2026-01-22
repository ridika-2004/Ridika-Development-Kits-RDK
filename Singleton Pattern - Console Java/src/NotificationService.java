public class NotificationService {

    public void sendNotification() {
        LoggerService instance =  LoggerService.getInstance();
        instance.log("ERROR", "Failed to send notification");
    }
}
