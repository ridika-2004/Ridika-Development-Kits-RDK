public class InfoLog implements Log {

    @Override
    public void write(String message) {
        System.out.println("[INFO] " + message);
    }
}