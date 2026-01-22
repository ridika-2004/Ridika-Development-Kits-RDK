public class Main {
    public static void main(String[] args) {

        AuthenticationService auth = new AuthenticationService();
        PaymentService payment = new PaymentService();
        ReportingService report = new ReportingService();
        NotificationService notify = new NotificationService();

        auth.login();
        payment.processPayment();
        report.generateReport();
        notify.sendNotification();
    }
}
