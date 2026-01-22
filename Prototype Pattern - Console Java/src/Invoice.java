public class Invoice implements Document {

    String content = "Invoice data";

    @Override
    public Document clone() {
        return new Invoice();
    }

    @Override
    public void show() {
        System.out.println(content);
    }
}
