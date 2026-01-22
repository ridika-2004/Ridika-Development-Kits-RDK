public class Report implements Document {

    String content = "Report data";

    @Override
    public Document clone() {
        return new Report();
    }

    @Override
    public void show() {
        System.out.println(content);
    }
}
