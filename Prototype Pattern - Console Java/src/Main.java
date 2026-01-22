public class Main {
    public static void main(String[] args) {

        Document doc1 = DocumentFactory.getDocument("REPORT");
        Document doc2 = DocumentFactory.getDocument("INVOICE");
        Document doc3 = DocumentFactory.getDocument("CONTRACT");

        doc1.show();
        doc2.show();
        doc3.show();
    }
}
