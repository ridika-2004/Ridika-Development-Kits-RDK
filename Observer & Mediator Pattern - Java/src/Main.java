public class Main {
    public static void main(String[] args) {

        Subject teacher = new Teacher("Sally");
        Observer s1 = new Student("Ridika");
        Observer s2 = new Student("Era");

        IAnnouncement announcement = new Announcement(teacher);

        announcement.subscribe(s1);
        announcement.subscribe(s2);

        announcement.postAnnouncement("From miss sally -> Today's lab will have internet restrictions");
    
        ClassroomMediator mediator = new ClassroomMediator();

        User t = new TeacherUser(mediator, "Sally");
        User st1 = new StudentUser(mediator, "Ridika");
        User st2 = new StudentUser(mediator, "Era");

        mediator.addUser(t);
        mediator.addUser(st1);
        mediator.addUser(st2);

        st1.send("ma'am, syllabus?", t);
        t.sendToAll("Chapter 1 to 3");
    }
}
