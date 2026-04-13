package com.bootcampexercise.module10;

/**
 * @author Markuss
 * @purpose a Student class which inherits attributes and methods from Person
 */
public class Student extends Person{
    private String schoolName;

    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.printf("I study in %s\n", this.getSchoolName());
    }
}
