package com.selam.demo.ecommerce;

import org.springframework.stereotype.Component;

@Component
public class SMSNotificationService implements NotificationService{
    @Override
    public void sendConfirmation(String recipient, String orderId) {
        System.out.println("SMS to: " + recipient);
        System.out.println("   Your order #" + orderId + " is confirmed!\n");
    }
}
