package com.bootcampexercise.module10;

public class AbstractActivity {
    /**
     * @author Markuss
     * @purpose print the Employee's and Student's `introduce` methods
     * @output My name is Bryan, and I am 29 years old.
     * I work as a Software Developer at Oracle and my salary is 2345.45
     * -----------
     * My name is Linda, and I am 25 years old.
     * I study in Stanford university
     *
     * Process finished with exit code 0
     */
    static void main() {
        Employee e = new Employee("Bryan", 29,  "Oracle", "Software Developer", 2345.45);
        Student s = new Student("Linda", 25, "Stanford university");
        e.introduce();
        System.out.println("-----------");
        s.introduce();

    }
}
