public class PartTime extends Staff{

    public double rate;
    public double work_hour;

    public PartTime(String name, String address, String phoneNumber, String email, String office, MyDate dateHired, String title, double rate, double work_hour){
        super(name, address, phoneNumber, email, office, dateHired, title);
        this.rate = rate;
        this.work_hour = work_hour;
    }

    public void getSalary(){
        double salary = rate*work_hour;
        System.out.println("Part Time Staff's Daily Salary : "+ salary);
    }
}