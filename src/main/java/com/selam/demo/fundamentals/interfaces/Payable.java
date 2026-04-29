package com.selam.demo.fundamentals.interfaces;

public interface Payable {
    void processPayment(double amount);
    String getPaymentDetails();

    // Constant (public static final by default)
    double TAX_RATE = 0.1;

    // Default method (Java 8+) - has implementation!
    default double calculateTax(double amount) {
        return amount * TAX_RATE;
    }
}