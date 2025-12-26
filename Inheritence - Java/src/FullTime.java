public class FullTime extends Staff{

    public final double salary = 1000;

    public FullTime(String name, String address, String phoneNumber, String email, String office, MyDate dateHired, String title){
        super(name, address, phoneNumber, email, office, dateHired, title);
    }

    public void getSalary(){
        System.out.println("Full Time Staff's Daily Salary : "+salary);
    }
}