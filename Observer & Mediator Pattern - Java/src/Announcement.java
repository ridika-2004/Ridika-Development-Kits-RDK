import java.util.ArrayList;
import java.util.List;

public class Announcement implements IAnnouncement{

    public Subject teacher;
    private List<Observer> students = new ArrayList<>();

    public Announcement(Subject teacher){
        this.teacher = teacher;
    }

    @Override
    public void postAnnouncement(String msg) {
        teacher.notifyAllObservers(msg, students);
    }

    @Override
    public void subscribe(Observer o) {
        students.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        students.remove(o);
    }
}
