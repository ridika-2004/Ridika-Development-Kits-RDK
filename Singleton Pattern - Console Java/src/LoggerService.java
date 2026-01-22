public class LoggerService {

    private static volatile LoggerService instance;

    private LoggerService() {}

    public static LoggerService getInstance() {
        if (instance == null) {
            synchronized (LoggerService.class) {
                if (instance == null) {
                    instance = new LoggerService();
                }
            }
        }
        return instance;
    }

    public void log(String type, String message) {
        Log log = LogFactory.getLog(type);
        log.write(message);
    }
}
