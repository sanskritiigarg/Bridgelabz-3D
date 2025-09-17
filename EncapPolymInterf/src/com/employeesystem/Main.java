package com.employeesystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee ftEmployee = new FullTimeEmployee(101, "Alice", 60000);
        ftEmployee.assignDepartment("Technology");
        
        PartTimeEmployee ptEmployee = new PartTimeEmployee(102, "Bob", 0, 80, 25);
        ptEmployee.assignDepartment("Human Resources");

        employees.add(ftEmployee);
        employees.add(ptEmployee);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("---------------------------------");
        }
    }
}