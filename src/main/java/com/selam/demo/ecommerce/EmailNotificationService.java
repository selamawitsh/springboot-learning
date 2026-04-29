package com.selam.demo.ecommerce;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendConfirmation(String recipient, String orderId) {
        System.out.println("EMAIL to: " + recipient);
        System.out.println("   Order #" + orderId + " confirmed!\n");
    }
}

