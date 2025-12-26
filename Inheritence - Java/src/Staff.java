public abstract class Staff extends Employee{

    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, MyDate dateHired, String title){
        super(name, address, phoneNumber, email, office, dateHired);
        this.title = title;
    }

    public abstract void getSalary();

    public String getTitle(){
        return title;
    }
}