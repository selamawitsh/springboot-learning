package com.selam.demo.fundamentals.abstractclass;

public abstract class Employee {
    protected String name;
    protected String employeeId;
    protected double baseSalary;

    // Constructor - abstract classes CAN have constructors!
    public Employee(String name, String employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    // ABSTRACT methods - MUST be implemented by subclasses
    public abstract double calculateSalary();
    public abstract String getRole();
    public abstract void work();

    // CONCRETE methods - shared implementation
    public void clockIn() {
        System.out.println(name + " (" + getRole() + ") clocked in");
    }

    public void clockOut() {
        System.out.println(name + " (" + getRole() + ") clocked out");
    }

    public void displayInfo() {
        System.out.println(" Employee: " + name);
        System.out.println(" ID: " + employeeId);
        System.out.println(" Role: " + getRole());
        System.out.println(" Salary: $" + calculateSalary());
    }
}