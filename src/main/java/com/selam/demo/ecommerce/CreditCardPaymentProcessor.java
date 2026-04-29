package com.selam.demo.ecommerce;

import org.springframework.stereotype.Component;

@Component
class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println(" Charging credit card: $" + amount);
        System.out.println("   Approved!\n");
    }
}