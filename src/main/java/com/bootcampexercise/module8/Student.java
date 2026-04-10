package com.bootcampexercise.module8;

import java.util.ArrayList;

public class Student {
    // TODO: Define id,name,grade attributes
    private int id;
    private String name;
    private double grade;

    // TODO: Create method to Add student (prevent duplicate ID)
    private static void addStudent(ArrayList<Student> studentArray, Student s){
        studentArray.add(s);
    }
    // TODO: Create method Print all students
    private static void printAllStudents(ArrayList<Student> studentArray){
        System.out.println(studentArray);
    }

    //    TODO: Create constructor: id,name,grade as params
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // TODO: get and set methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    //    TODO: Print student details method
    public void printStudent() {
        System.out.println("Student{" +
                            "id=" + id +
                            ", name='" + name + '\'' +
                            ", grade=" + grade +
                            '}');
    }
}
