package com.employeesystem;

public class PartTimeEmployee extends Employee implements Department {
 private int hoursWorked;
 private double hourlyRate;
 private String department;

 public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
     super(employeeId, name, baseSalary); // baseSalary might be 0 or a nominal value
     this.hoursWorked = hoursWorked;
     this.hourlyRate = hourlyRate;
 }

 @Override
 public double calculateSalary() {
     return hoursWorked * hourlyRate;
 }

 @Override
 public void assignDepartment(String department) {
     this.department = department;
 }

 @Override
 public String getDepartmentDetails() {
     return this.department;
 }
 
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Department: " + getDepartmentDetails());
     System.out.println("Hours Worked: " + hoursWorked);
     System.out.println("Hourly Rate: $" + hourlyRate);
     System.out.println("Calculated Salary (Part-Time): $" + calculateSalary());
 }
}