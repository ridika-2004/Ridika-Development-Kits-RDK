public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void update(String msg) {
        System.out.println(name + " received: " + msg);
    }
}