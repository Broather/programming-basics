package com.bootcampexercise.module10;

import com.bootcampexercise.module8.Student;

import java.util.ArrayList;

/**
 * @author Markuss
 * @purpose an Employee class which inherits attributes and methods from Person
 */
public class Employee extends Person {
    private String jobTitle;
    private String company;
    private double salary;

//    TODO: add another constructor (can't instantiate Person class)
    public Employee(String name, int age, String company, String jobTitle, double salary) {
        super(name, age);
        this.company = company;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.printf("I work as a %s at %s and my salary is %.2f\n", this.getJobTitle(), this.getCompany(), this.getSalary());
    }
    public static Employee getHighestPaidEmp(ArrayList<Employee> el){
        Employee result = el.getFirst();
        for (Employee e : el) {
            if (e.getSalary() > result.getSalary()) {
                result = e;
            }
        }
        return result;
    }
}
