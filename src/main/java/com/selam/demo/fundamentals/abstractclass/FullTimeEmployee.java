package com.selam.demo.fundamentals.abstractclass;

public class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String name, String id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public String getRole() {
        return "Full-Time";
    }

    @Override
    public void work() {
        System.out.println("💼 " + name + " works 40 hours/week");
    }
}