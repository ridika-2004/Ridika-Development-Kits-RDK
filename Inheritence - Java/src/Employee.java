public class Employee extends Person {

    private String office;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public MyDate getDateHired() {
        return dateHired;
    }
}