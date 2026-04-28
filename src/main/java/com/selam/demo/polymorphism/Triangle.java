package com.selam.demo.polymorphism;

public class Triangle extends Shape {
    private double base, height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * base; // equilateral assumption
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + color + " triangle (base=" + base + ")");
    }
}