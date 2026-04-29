package com.selam.demo.ecommerce;

public class Order {
    private String id;
    private String customerName;
    private String customerEmail;
    private double amount;

    public Order(String id, String name, String email, double amount){
        this.id = id;
        this.customerEmail= email;
        this.customerName= name;
        this.amount= amount;
    }

    String getId(){ return id;}
    String getCustomerName(){ return customerName; }
    String getCustomerEmail(){ return customerEmail; }
    double getAmount(){ return amount ; }

}
