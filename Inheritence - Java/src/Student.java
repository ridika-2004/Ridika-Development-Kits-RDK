public class Student extends Person {

    private String status;
    
    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
}