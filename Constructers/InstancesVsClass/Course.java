public class Course {
    String courseName;   
    int duration;        
    double fee;          
    static String instituteName = "Tech Institute"; 

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println("-------------------");
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Full Stack", 6, 30000);
        Course c2 = new Course("Python ML", 4, 25000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Global IT Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}