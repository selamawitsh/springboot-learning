package com.selam.demo.fundamentals.integration;


// ===== INTERFACES =====
interface PaymentProcessor {
    void processPayment(double amount);
    String getPaymentType();
}

interface Shippable {
    void ship();
    String getTrackingNumber();
}

// ===== ABSTRACT CLASS =====
abstract class Product {
    // ENCAPSULATION: private fields
    private String productId;
    private String name;
    protected double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract methods
    public abstract String getCategory();
    public abstract void displayDetails();

    // Concrete methods with encapsulation
    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public double applyDiscount(double percentage) {
        return price * (1 - percentage/100);
    }
}

// ===== CONCRETE CLASSES =====
class Electronics extends Product implements Shippable {
    private String warranty;
    private double weight;

    public Electronics(String id, String name, double price, String warranty, double weight) {
        super(id, name, price);
        this.warranty = warranty;
        this.weight = weight;
    }

    @Override
    public String getCategory() { return "Electronics"; }

    @Override
    public void displayDetails() {
        System.out.println("  📱 " + getName() + " | $" + getPrice());
        System.out.println("     Warranty: " + warranty + " | Weight: " + weight + "kg");
    }

    @Override
    public void ship() {
        System.out.println("  🚚 Shipping: " + getName() + " (" + weight + "kg)");
    }

    @Override
    public String getTrackingNumber() {
        return "ELEC-" + getProductId();
    }
}

class DigitalProduct extends Product implements PaymentProcessor {
    private String downloadLink;

    public DigitalProduct(String id, String name, double price, String downloadLink) {
        super(id, name, price);
        this.downloadLink = downloadLink;
    }

    @Override
    public String getCategory() { return "Digital"; }

    @Override
    public void displayDetails() {
        System.out.println("  💿 " + getName() + " | $" + getPrice() + " (Digital Download)");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("  💳 Digital payment: $" + amount);
    }

    @Override
    public String getPaymentType() {
        return "Instant Digital Download";
    }
}

class PhysicalGood extends Product implements Shippable, PaymentProcessor {
    private int stock;

    public PhysicalGood(String id, String name, double price, int stock) {
        super(id, name, price);
        this.stock = stock;
    }

    @Override
    public String getCategory() { return "Physical Goods"; }

    @Override
    public void displayDetails() {
        System.out.println("  📦 " + getName() + " | $" + getPrice() + " | Stock: " + stock);
    }

    @Override
    public void ship() {
        stock--;
        System.out.println("  🚚 Shipping: " + getName() + " (Stock left: " + stock + ")");
    }

    @Override
    public String getTrackingNumber() {
        return "PHYS-" + getProductId();
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("  💳 Standard payment: $" + amount);
    }

    @Override
    public String getPaymentType() {
        return "Standard Payment with Shipping";
    }
}

// ===== MAIN INTEGRATION CLASS =====
public class OOPIntegrationDemo {
    public static void main(String[] args) {
        // Create products using CONCRETE CLASSES
        Electronics laptop = new Electronics("E001", "Gaming Laptop", 1200, "2 Years", 2.5);
        DigitalProduct ebook = new DigitalProduct("D001", "Java OOP Guide", 29.99, "download.link");
        PhysicalGood phone = new PhysicalGood("P001", "Smartphone", 699, 50);

        // ===== 1. ENCAPSULATION =====
        System.out.println("1. ENCAPSULATION");
        System.out.println("   Product: " + laptop.getName());
        System.out.println("   ID: " + laptop.getProductId());
        System.out.println("   Discounted: $" + laptop.applyDiscount(15));
        System.out.println("   ✅ Private fields, controlled access!\n");

        // ===== 2. ABSTRACT CLASSES =====
        System.out.println("2. ABSTRACT CLASSES");
        Product[] products = {laptop, ebook, phone};
        for(Product p : products) {
            System.out.println("   [" + p.getCategory() + "]");
            p.displayDetails();  // Each displays differently!
        }
        System.out.println("   ✅ Common structure, unique implementations!\n");

        // ===== 3. INTERFACES =====
        System.out.println("3. INTERFACES");
        System.out.println("   Shippable items:");
        Shippable[] shippables = {laptop, phone};
        for(Shippable s : shippables) {
            s.ship();
            System.out.println("   Tracking: " + s.getTrackingNumber());
        }
        System.out.println("   ✅ Multiple capabilities via interfaces!\n");

        // ===== 4. POLYMORPHISM =====
        System.out.println("4. POLYMORPHISM");
        System.out.println("   Processing payments:");
        PaymentProcessor[] payments = {ebook, phone};
        for(PaymentProcessor pp : payments) {
            pp.processPayment(pp instanceof DigitalProduct ? ebook.getPrice() : phone.getPrice());
            System.out.println("   Type: " + pp.getPaymentType());
        }
        System.out.println("   ✅ Same method, different behaviors!\n");

        // ===== 5. CONCRETE CLASSES =====
        System.out.println("5. CONCRETE CLASSES");
        System.out.println("Created " + products.length + " product instances");
        System.out.println("Each fully implemented and ready to use");
        System.out.println("Direct instantiation, complete functionality!\n");
    }
}