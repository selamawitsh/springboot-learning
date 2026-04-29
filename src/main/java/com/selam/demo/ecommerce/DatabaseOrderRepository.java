package com.selam.demo.ecommerce;


import org.springframework.stereotype.Component;

@Component
public class DatabaseOrderRepository implements OrderRepository {
    @Override
    public void save(Order order){
        System.out.println("Saving to MySQL database...");
        System.out.println("   Order: #" + order.getId());
        System.out.println("   Customer: " + order.getCustomerName());
        System.out.println("   Amount: $" + order.getAmount());
        System.out.println("   Saved!\n");

    }
}
