package com.bootcampexercise.module5.activity;

public class InhertitanceActivity {
    /**
     * @author Markuss
     * @purpose print Employee and Person object attributes
     * @output -----------------------------
     * Employee(name = Shawn Cun, age = 32, title = Developer, salary = 70000.000000)
     * Person(age = 21, name = Sarah Johnson)
     *
     * Process finished with exit code 0
     */
    static void main() {

        // Create Person object p. Write code to and set name of Person as Sarah Johnson
        // and age as 21

        Person_I myPerson = new Person_I("Sarah Johnson", 21);

        System.out.println("-----------------------------");
        //Create Employee object e and
        // set salary as 70000.00, title as Developer, age as 32 and name as Shawn Cun
        Employee_I myEmployee = new Employee_I(70000.00, "Developer", 32, "Shawn Cun");

        // Print Info using Employee object - name, age, title, salary
        System.out.printf("Employee(name = %s, age = %d, title = %s, salary = %f)\n", myEmployee.getName(), myEmployee.getAge(), myEmployee.getTitle(), myEmployee.getSalary());

        // Print Info using Person object - age, name
        System.out.printf("Person(age = %d, name = %s)\n", myPerson.getAge(), myPerson.getName());

    }
}