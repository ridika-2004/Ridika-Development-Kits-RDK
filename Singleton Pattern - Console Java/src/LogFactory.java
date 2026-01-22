public class LogFactory {

    public static Log getLog(String type) {
        if (type.equalsIgnoreCase("INFO")) {
            return new InfoLog();
        } 
        if (type.equalsIgnoreCase("ERROR")) {
            return new ErrorLog();
        } 
        if (type.equalsIgnoreCase("WARNING")) {
            return new WarningLog();
        }
        return null;
    }
}
