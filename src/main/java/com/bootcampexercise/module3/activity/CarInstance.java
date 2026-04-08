package com.bootcampexercise.module3.activity;

public class CarInstance {
    static void main() {
        Car c = new Car("Toyota", "red", 2121);
        System.out.println(c.getName());
        System.out.printf("Car( name = %s, color = %s, modelNo = %d)", c.getName(), c.getColor(), c.getModelNo());
    }
}
