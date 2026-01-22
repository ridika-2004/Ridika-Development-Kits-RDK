public class DocumentFactory {

    private static Document report = new Report();
    private static Document invoice = new Invoice();
    private static Document contract = new Contract();

    public static Document getDocument(String type) {

        if (type.equalsIgnoreCase("REPORT"))
            return report.clone();

        if (type.equalsIgnoreCase("INVOICE"))
            return invoice.clone();

        if (type.equalsIgnoreCase("CONTRACT"))
            return contract.clone();

        return null;
    }
}
