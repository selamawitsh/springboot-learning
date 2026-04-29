package com.selam.demo.fundamentals.interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("INV001", "Tech Corp", 1000);

        // Using as Payable
        System.out.println("--- As Payable ---");
        Payable payable = invoice;
        System.out.println(payable.getPaymentDetails());
        payable.processPayment(1000);

        // Using as Printable
        System.out.println("\n--- As Printable ---");
        Printable printable = invoice;
        System.out.println("Format: " + printable.getFormat());
        printable.print();

        System.out.println("\n One class, multiple capabilities!");
        System.out.println(" Interfaces enable flexible design");
    }
}