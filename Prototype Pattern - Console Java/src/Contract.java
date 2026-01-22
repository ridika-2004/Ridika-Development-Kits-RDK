public class Contract implements Document {

    String content = "Contract Data";

    @Override
    public Document clone() {
        return new Contract();
    }

    @Override
    public void show() {
        System.out.println(content);
    }
}
