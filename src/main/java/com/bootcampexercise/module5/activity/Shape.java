package com.bootcampexercise.module5.activity;

public abstract class Shape {
    private String color;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void setColor(String c) {
        this.color = c;
    }

    public String getColor() {
        return this.color;
    }
}
