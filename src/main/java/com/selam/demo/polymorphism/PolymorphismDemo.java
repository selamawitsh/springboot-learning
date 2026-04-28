package com.selam.demo.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Polymorphic array - all treated as Shape!
        Shape[] shapes = {
                new Circle("Red", 5),
                new Rectangle("Blue", 4, 6),
                new Triangle("Green", 3, 4),
                new Circle("Yellow", 2)
        };

        System.out.println("Processing " + shapes.length + " shapes polymorphically:\n");

        for(Shape shape : shapes) {
            shape.draw();          // Different for each shape!
            shape.displayInfo();   // Different calculations!
            System.out.println();
        }

        System.out.println("✅ One interface (Shape), many implementations!");
        System.out.println("✅ Add new shapes without changing existing code!");
    }
}