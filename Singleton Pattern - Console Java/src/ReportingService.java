public class ReportingService {

    public void generateReport() {
        LoggerService instance =  LoggerService.getInstance();
        instance.log("WARNING", "Report generation took longer than expected");
    }
}
