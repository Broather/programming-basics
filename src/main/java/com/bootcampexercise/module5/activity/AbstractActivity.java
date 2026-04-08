package com.bootcampexercise.module5.activity;

public class AbstractActivity {
    static void main() {
        Rectangle rect = new Rectangle(10, 10);
        Circle circle = new Circle(10);

        // set and Print color of rectangle
        rect.setColor("red");
        System.out.printf("Rectangle's color = %s", circle.getColor());

        // Give area of rectangle
        System.out.printf("Area of rectangle = %f\n", rect.calculateArea());

        // Print perimeter of rectangle
        System.out.printf("Perimeter of rectangle = %f\n", rect.calculatePerimeter());

        // set and Print color of circle
        circle.setColor("green");
        System.out.printf("Circle's color = %s", circle.getColor());

        // Give area of circle
        System.out.printf("Area of rectangle = %f\n", circle.calculateArea());

        // Print perimeter of circle
        System.out.printf("Perimeter of circle = %f\n", circle.calculatePerimeter());
    }
}
