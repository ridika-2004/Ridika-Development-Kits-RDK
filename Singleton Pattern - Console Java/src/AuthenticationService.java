public class AuthenticationService {

    public void login() {
        LoggerService instance =  LoggerService.getInstance();
        instance.log("INFO", "User authenticated successfully");
    }
}
