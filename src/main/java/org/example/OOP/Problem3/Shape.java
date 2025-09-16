package org.example.OOP.Problem3;


abstract class Shape{
    abstract double area();
    abstract double perimeter();
    abstract double scale(int n);

}

class Circle extends Shape{
    private double radius;
    private static final double PI = 3.1416;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return PI*radius*radius ;
    }

    @Override
    double perimeter() {
        return 2*PI*radius;
    }

    @Override
    double scale(int n) {
        return n*2*area();
    }

}

class Triangle extends Shape{

    private double height;
    private double breadth;
    private double side1;
    private double side2;

    public Triangle(double height, double breadth, double side1, double side2) {
        this.height = height;
        this.breadth = breadth;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double area() {
        return 0.5*height*breadth;
    }

    @Override
    double perimeter() {
        return breadth+side1+side2;
    }

    @Override
    double scale(int n) {
       return n*2*area();
    }
}

class Rectangle extends Shape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length*breadth;
    }

    @Override
    double perimeter() {
        return 2*(length+breadth);
    }

    @Override
    double scale(int n) {
     return n*2*area();
    }

}
