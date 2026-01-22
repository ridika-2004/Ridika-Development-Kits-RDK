public class PaymentService {

    public void processPayment() {
        LoggerService instance =  LoggerService.getInstance();
        instance.log("INFO", "Payment processed");
    }
}
