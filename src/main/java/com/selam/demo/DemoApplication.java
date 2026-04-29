package com.selam.demo;

import com.selam.demo.ecommerce.CheckoutService;
import com.selam.demo.ecommerce.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(DemoApplication.class, args);

		// Get the fully assembled CheckoutService
		CheckoutService checkout = context.getBean(CheckoutService.class);

		// Create an order
		Order order1 = new Order("ORD-001", "Selam", "selam@email.com", 49.99);
		checkout.checkout(order1);

		Order order2 = new Order("ORD-002", "John", "john@email.com", 129.50);
		checkout.checkout(order2);

		context.close();
	}

}

