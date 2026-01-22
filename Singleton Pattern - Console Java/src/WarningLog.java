public class WarningLog implements Log {

    @Override
    public void write(String message) {
        System.out.println("[WARNING] " + message);
    }
}
