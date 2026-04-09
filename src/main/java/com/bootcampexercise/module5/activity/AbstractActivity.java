package com.bootcampexercise.module5.activity;

public class AbstractActivity {
    /**
     * @author Markuss
     * @purpose print the color, area and perimeter of rectangle and circle
     * @output Rectangle's color = red
     *      Area of rectangle = 100.000000
     *      Perimeter of rectangle = 40.000000
     *      Circle's color = green
     *      Area of rectangle = 314.159265
     *      Perimeter of circle = 62.831853
     *
     *      Process finished with exit code 0
     */
    static void main() {
        Rectangle rect = new Rectangle(10, 10);
        Circle circle = new Circle(10);

        // set and Print color of rectangle
        rect.setColor("red");
        System.out.printf("Rectangle's color = %s\n", rect.getColor());

        // Give area of rectangle
        System.out.printf("Area of rectangle = %f\n", rect.calculateArea());

        // Print perimeter of rectangle
        System.out.printf("Perimeter of rectangle = %f\n", rect.calculatePerimeter());

        // set and Print color of circle
        circle.setColor("green");
        System.out.printf("Circle's color = %s\n", circle.getColor());

        // Give area of circle
        System.out.printf("Area of rectangle = %f\n", circle.calculateArea());

        // Print perimeter of circle
        System.out.printf("Perimeter of circle = %f\n", circle.calculatePerimeter());
    }
}
