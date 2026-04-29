package com.selam.demo.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CheckoutService {
    private final OrderRepository orderRepo;
    private final PaymentProcessor paymentProcessor;
    private final NotificationService notificationService;

    @Autowired
    CheckoutService(OrderRepository orderRepo,
                    PaymentProcessor paymentProcessor,
                    NotificationService notificationService){
        this.orderRepo = orderRepo;
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
    }

    public void checkout(Order order){
        System.out.println("Processing order #" + order.getId() + "...\n");
        orderRepo.save(order);
        paymentProcessor.processPayment(order.getAmount());
        notificationService.sendConfirmation(order.getCustomerEmail(), order.getId());
        System.out.println("Order complete!\n");
    }
}
