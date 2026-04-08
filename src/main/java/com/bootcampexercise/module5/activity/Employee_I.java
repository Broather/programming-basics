package com.bootcampexercise.module5.activity;

public class Employee_I extends Person_I{
    private final double salary;
    private final String title;

    public Employee_I(double salary, String title, int age, String name) {
        super(name, age);
        this.salary = salary;
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public String getTitle() {
        return title;
    }
}
