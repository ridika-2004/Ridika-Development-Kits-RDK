public class Faculty extends Employee{

    private double office_hours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, MyDate dateHired, double office_hours, String rank){
        super(name, address, phoneNumber, email, office, dateHired);
        this.office_hours = office_hours;
        this.rank = rank;
    }

    public double getOffice_hours(){
        return office_hours;
    }

    public String getRank(){
        return rank;
    }
}