package com.man.introduction.Abstract;

// Abstract class
abstract class Shape {
    // Instance variable
    protected String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Concrete method (shared by all subclasses)
    public String getColor() {
        return color;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract double calculateArea();

    // Abstract method (must be implemented by subclasses)
    public abstract double calculatePerimeter();
}

// Subclass Circle extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); // Call parent class constructor
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Subclass Rectangle extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color); // Call parent class constructor
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main class to test the abstract class and its subclasses
public class Shapes {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Test Circle
        System.out.println("Circle Color: " + circle.getColor());
        System.out.printf("Circle Area: %.2f\n", circle.calculateArea());
        System.out.printf("Circle Perimeter: %.2f\n", circle.calculatePerimeter());

        System.out.println();

        // Test Rectangle
        System.out.println("Rectangle Color: " + rectangle.getColor());
        System.out.printf("Rectangle Area: %.2f\n", rectangle.calculateArea());
        System.out.printf("Rectangle Perimeter: %.2f\n", rectangle.calculatePerimeter());
    }
}