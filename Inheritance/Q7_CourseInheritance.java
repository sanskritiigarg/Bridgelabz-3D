class Course {
    String title;
    public Course(String title) { this.title = title; }
}

class OnlineCourse extends Course {
    public OnlineCourse(String title) { super(title); }
    public void mode() { System.out.println(title + " is online"); }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    public PaidOnlineCourse(String title, double fee) { super(title); this.fee = fee; }
    public void details() { System.out.println(title + " costs " + fee); }
}

public class Q7_CourseInheritance {
    public static void main(String[] args) {
        PaidOnlineCourse c = new PaidOnlineCourse("Java", 5000);
        c.mode();
        c.details();
    }
}
