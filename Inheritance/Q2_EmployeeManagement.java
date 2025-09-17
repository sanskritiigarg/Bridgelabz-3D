class Employee {
    protected String name;
    public Employee(String name) { this.name = name; }
    public void work() { System.out.println(name + " works"); }
}

class Manager extends Employee {
    public Manager(String name) { super(name); }

    @Override
    public void work() { System.out.println(name + " manages team"); }
}

class Developer extends Employee {
    public Developer(String name) { super(name); }
      @Override
      public void work() { System.out.println(name + " writes code"); }
}

class Intern extends Employee {
    public Intern(String name) { super(name); }
      @Override
      public void work() { System.out.println(name + " assists with tasks"); }
}

public class Q2_EmployeeManagement {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice");
        Employee e2 = new Developer("Bob");
        Employee e3 = new Intern("Charlie");
        e1.work();
        e2.work();
        e3.work();
    }
}
