package com.bootcampexercise.module3.activity;

public class Car {
    private String name;
    private String color;
    private int modelNo;
    public Car(String name, String color, int modelNo){
        this.name = name;
        this.color = color;
        this.modelNo = modelNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

}
