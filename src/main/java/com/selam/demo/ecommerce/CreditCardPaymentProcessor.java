package com.selam.demo.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreditCardPaymentProcessor implements PaymentProcessor {

    private final StripeClient stripeClient;

    @Autowired
    public CreditCardPaymentProcessor(StripeClient stripeClient) {
        this.stripeClient = stripeClient;
        System.out.println("CreditCardPaymentProcessor created with StripeClient");
    }

    @Override
    public void processPayment(double amount) {
        stripeClient.charge(amount);
    }
}