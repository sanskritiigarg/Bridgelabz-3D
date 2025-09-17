class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
    
    private double getSalary(){
        return salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}

class Manager extends Employee {
    private String team;

    public Manager(String employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayManagerInfo() {
        System.out.println("--- Manager Details ---");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Team: " + team);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Employee employee = new Employee("E101", "Technology", 75000);
        System.out.println("--- Employee Details ---");
        employee.displayEmployeeInfo();
        employee.setSalary(80000);
        System.out.println("After salary update:");
        employee.displayEmployeeInfo();
        System.out.println();

        Manager manager = new Manager("M201", "Management", 120000, "Development Team");
        manager.displayManagerInfo();
    }
}
