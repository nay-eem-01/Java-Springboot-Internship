package org.example.OOP.Problem08;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(4,6);
        System.out.println("Area of square: " + square.calculateArea());
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
