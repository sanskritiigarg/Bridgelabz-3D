package com.employeesystem;

public class FullTimeEmployee extends Employee implements Department {
 private String department;

 public FullTimeEmployee(int employeeId, String name, double baseSalary) {
     super(employeeId, name, baseSalary);
 }

 @Override
 public double calculateSalary() {
     return getBaseSalary() * 1.20;
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
     System.out.println("Calculated Salary (Full-Time): $" + calculateSalary());
 }
}