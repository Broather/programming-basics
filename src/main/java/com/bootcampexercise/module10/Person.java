package com.bootcampexercise.module10;

/**
 * @author Markuss
 * @purpose an abstract Person class, but it still has implementations for all it's methods
 */
public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduce(){
        System.out.printf("My name is %s, and I am %d years old.\n", this.getName(), this.getAge());
    }

}
