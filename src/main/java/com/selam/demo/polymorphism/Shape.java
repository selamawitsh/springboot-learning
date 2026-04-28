package com.selam.demo.polymorphism;

/**
 * Base class enabling polymorphism -
 * one interface, many implementations
 */
public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract methods - each shape implements differently
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract void draw();

    // Common method
    public void displayInfo() {
        System.out.printf("%s %s | Area: %.2f | Perimeter: %.2f%n",
                color, getClass().getSimpleName(),
                calculateArea(), calculatePerimeter());
    }
}