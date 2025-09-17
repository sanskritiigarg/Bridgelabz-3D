class Person {
    String name;
    public Person(String name) { this.name = name; }
}

class Teacher extends Person {
    public Teacher(String name) { super(name); }
    public void role() { System.out.println(name + " teaches"); }
}

class Student extends Person {
    public Student(String name) { super(name); }
    public void role() { System.out.println(name + " studies"); }
}

class Staff extends Person {
    public Staff(String name) { super(name); }
    public void role() { System.out.println(name + " supports"); }
}

public class Q9_PersonHierarchy {
    public static void main(String[] args) {
        new Teacher("Alice").role();
        new Student("Bob").role();
        new Staff("Charlie").role();
    }
}

