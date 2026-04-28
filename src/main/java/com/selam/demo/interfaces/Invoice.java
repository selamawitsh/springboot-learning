package com.selam.demo.interfaces;

// A class CAN implement MULTIPLE interfaces!
public class Invoice implements Payable, Printable {
    private String invoiceNumber;
    private String client;
    private double amount;

    public Invoice(String invoiceNumber, String client, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.client = client;
        this.amount = amount;
    }

    // Payable implementation
    @Override
    public void processPayment(double amount) {
        double tax = calculateTax(amount);
        double total = amount + tax;
        System.out.println("Processing Invoice #" + invoiceNumber);
        System.out.println("   Amount: $" + amount);
        System.out.println("   Tax: $" + tax);
        System.out.println("   Total: $" + total);
    }

    @Override
    public String getPaymentDetails() {
        return "Invoice #" + invoiceNumber + " - Client: " + client;
    }

    // Printable implementation
    @Override
    public void print() {
        System.out.println("   Number: " + invoiceNumber);
        System.out.println("   Client: " + client);
        System.out.println("   Amount: $" + amount);
    }

    @Override
    public String getFormat() {
        return "A4 PDF Format";
    }
}