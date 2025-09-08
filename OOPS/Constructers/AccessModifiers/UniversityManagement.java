class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return this.CGPA;
    }

    public void setCGPA(double newCGPA) {
        if (newCGPA >= 0.0 && newCGPA <= 4.0) {
            this.CGPA = newCGPA;
        }
    }

    public void displayStudentInfo() {
         System.out.println("Roll Number: " + rollNumber);
         System.out.println("Name: " + name);
         System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String researchArea;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchArea) {
        super(rollNumber, name, CGPA);
        this.researchArea = researchArea;
    }

    public void displayPostgraduateInfo() {
        System.out.println("--- Postgraduate Student Details ---");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + name);
        System.out.println("Student CGPA: " + getCGPA());
        System.out.println("Research Area: " + researchArea);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student student = new Student(101, "John Doe", 3.8);
        System.out.println("--- Student Details ---");
        student.displayStudentInfo();
        student.setCGPA(3.9);
        System.out.println("Updated CGPA: " + student.getCGPA());
        System.out.println();

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Jane Smith", 3.9, "Artificial Intelligence");
        pgStudent.displayPostgraduateInfo();
    }
}

