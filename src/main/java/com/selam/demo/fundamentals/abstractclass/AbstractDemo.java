package com.selam.demo.fundamentals.abstractclass;

public class AbstractDemo {
    public static void main(String[] args) {
        // CANNOT instantiate abstract class:
        // Employee emp = new Employee(...); // ❌ Error!

        FullTimeEmployee fullTime = new FullTimeEmployee("Selam", "FT001", 5000, 1000);
        ContractEmployee contract = new ContractEmployee("Alex", "CT001", 80, 50);

        System.out.println("Created concrete subclasses successfully!\n");

        Employee[] employees = {fullTime, contract};

        for(Employee emp : employees) {
            emp.clockIn();
            emp.work();
            emp.displayInfo();
            emp.clockOut();
            System.out.println();
        }

        System.out.println("Abstract classes: common structure, flexible implementation!");
    }
}