package com.selam.demo.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class EmailNotificationService implements NotificationService {

    private final EmailClient emailClient;

    @Autowired
    public EmailNotificationService(EmailClient emailClient) {
        this.emailClient = emailClient;
        System.out.println("EmailNotificationService created with EmailClient");
    }

    @Override
    public void sendConfirmation(String recipient, String orderId) {
        emailClient.send(
                recipient,
                "Order #" + orderId + " Confirmed!",
                "Thank you for your order. Your order #" + orderId + " is being processed."
        );
    }
}