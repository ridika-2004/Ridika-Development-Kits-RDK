import java.util.List;

public interface Subject {
    void notifyAllObservers(String announcement, List<Observer> students);
}