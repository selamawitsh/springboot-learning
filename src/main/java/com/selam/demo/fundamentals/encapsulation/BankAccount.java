package com.selam.demo.fundamentals.encapsulation;

public class BankAccount {
    // PRIVATE fields - cannot be accessed directly
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String pin;

    public BankAccount(String accountNumber, String accountHolder, String pin) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.pin = pin;
        this.balance = 0.0;
    }

    // Controlled access - only last 4 digits visible
    public String getAccountNumber() {
        return "****" + accountNumber.substring(accountNumber.length() - 4);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Public methods with validation (controlled modification)
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("✅ Deposited: $" + amount);
            return true;
        }
        System.out.println("❌ Invalid deposit amount");
        return false;
    }

    public boolean withdraw(double amount, String enteredPin) {
        if (!validatePin(enteredPin)) {
            System.out.println("❌ Incorrect PIN!");
            return false;
        }
        if (amount <= 0) {
            System.out.println("❌ Invalid withdrawal amount");
            return false;
        }
        if (amount > balance) {
            System.out.println("❌ Insufficient funds!");
            return false;
        }

        this.balance -= amount;
        System.out.println("✅ Withdrawn: $" + amount);
        return true;
    }

    // PRIVATE method - internal logic hidden from outside
    private boolean validatePin(String enteredPin) {
        return this.pin.equals(enteredPin);
    }
}