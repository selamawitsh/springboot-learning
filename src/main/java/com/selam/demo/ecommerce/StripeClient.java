package com.selam.demo.ecommerce;

// Simulated library class - we CANNOT edit this
public class StripeClient {
    private String apiKey;

    public StripeClient(String apiKey) {
        this.apiKey = apiKey;
    }

    public void charge(double amount) {
        System.out.println("Stripe charging $" + amount);
        System.out.println("   Using API key: " + apiKey.substring(0, 8) + "...");
        System.out.println("   Approved!\n");
    }
}