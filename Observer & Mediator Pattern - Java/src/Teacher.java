import java.util.*;

public class Teacher implements Subject {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void notifyAllObservers(String msg, List<Observer> students) {
        for (Observer s : students) {
            s.update(msg);
        }
    }
}