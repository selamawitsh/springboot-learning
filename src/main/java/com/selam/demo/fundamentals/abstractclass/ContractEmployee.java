package com.selam.demo.fundamentals.abstractclass;

public class ContractEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public ContractEmployee(String name, String id, int hoursWorked, double hourlyRate) {
        super(name, id, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String getRole() {
        return "Contract";
    }

    @Override
    public void work() {
        System.out.println("📋 " + name + " works " + hoursWorked + " hrs on contract");
    }
}