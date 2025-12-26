public class App {
    public static void main(String[] args) throws Exception {

        MyDate d1 = new MyDate(2025, 11, 20);
        Staff s1 = new PartTime("Sally", "IUT Hall", "01000000000", "sally@gmail.com", "IUT", d1, "cleaner", 20 , 9);
        s1.getSalary();
        System.out.println(s1.toString());
    }
}
