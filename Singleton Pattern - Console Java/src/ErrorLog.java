public class ErrorLog implements Log {

    @Override
    public void write(String message) {
        System.out.println("[ERROR] " + message);
    }
}