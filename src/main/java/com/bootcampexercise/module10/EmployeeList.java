package com.bootcampexercise.module10;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeList {
    /**
     * @author Markuss
     * @purpose Create a list of employee objects and have the highest paid employee introduce themselves
     * @output The highest paid employee will now introduce themselves
     * My name is Billy, and I am 21 years old.
     * I work as a Cloud computing expert at OpenAI and my salary is 5454.54
     *
     * Process finished with exit code 0
     */
    static void main() {
        ArrayList<Employee> employeeArrayList = new ArrayList<>(Arrays.asList(
                new Employee("Ryan", 37, "Orbyt", "Software engineer", 2000),
                new Employee("Brenda", 29, "Circle K", "Cashier", 1717.17),
                new Employee("Diana", 32, "Google", "AWS engineer", 3434.34),
                new Employee("Simona", 34, "Amazon", "Kubernetes engineer", 4343.43),
                new Employee("Billy", 21, "OpenAI", "Cloud computing expert", 5454.54)
        ));

        Employee highestPaidEmployee = Employee.getHighestPaidEmp((employeeArrayList));
        System.out.println("The highest paid employee will now introduce themselves");
        highestPaidEmployee.introduce();
    }
}
