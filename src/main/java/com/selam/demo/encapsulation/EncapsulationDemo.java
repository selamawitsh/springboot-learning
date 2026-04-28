package com.selam.demo.encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", "Selam", "1234");

        // Controlled access through public methods:
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());

        account.deposit(1000);
        account.withdraw(500, "1234");    // Correct PIN
        account.withdraw(200, "0000");    // Wrong PIN - rejected
        account.withdraw(2000, "1234");   // Insufficient funds

        System.out.println("\nFinal Balance: $" + account.getBalance());
        System.out.println("\n🔒 Encapsulation protects data integrity!");
    }
}