package com.selam.demo.ecommerce;

// Simulated library class - we CANNOT edit this
public class EmailClient {
    private String sender;
    private String smtpServer;

    public EmailClient(String sender, String smtpServer) {
        this.sender = sender;
        this.smtpServer = smtpServer;
    }

    public void send(String to, String subject, String body) {
        System.out.println("Sending via " + smtpServer);
        System.out.println("   From: " + sender);
        System.out.println("   To: " + to);
        System.out.println("   Subject: " + subject);
        System.out.println("   Body: " + body);
        System.out.println("   Sent!\n");
    }
}