package org.example.OOP.Problem3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        Triangle triangle = new Triangle(2,2,2,2);
        Rectangle rectangle = new Rectangle(2,2);

        System.out.println("Circle");

        System.out.println("Area of circle: " + circle.area());
        System.out.println("Perimeter of circle: " + circle.perimeter());
        System.out.println("After scaling area of circle: " + circle.scale(2));

        System.out.println("Triangle");

        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Perimeter of Triangle: " + triangle.perimeter());
        System.out.println("After scaling area of Triangle: " + triangle.scale(2));

        System.out.println("Rectangle");
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());
        System.out.println("After scaling area of rectangle: " + rectangle.scale(2));
    }


}
