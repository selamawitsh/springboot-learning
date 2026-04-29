package com.selam.demo.ecommerce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EcommerceConfig {

    @Bean
    public StripeClient stripeClient() {
        System.out.println("Creating StripeClient bean...");
        return new StripeClient("sk_live_abc123_secret_key");
    }

    @Bean
    public EmailClient emailClient() {
        System.out.println("Creating EmailClient bean...");
        return new EmailClient("orders@myshop.com", "smtp.gmail.com");
    }
}