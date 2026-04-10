package com.bootcampexercise.module8;

import java.util.ArrayList;

public class StudentArrayList {
    /**
     * @author Markuss
     * @purpose call ArrayList methods to manipulate elements within the array
     * @output All Students:
     * Student{id=0, name='Ryan', grade=76.43}
     * Student{id=1, name='Justin', grade=45.78}
     * Student{id=2, name='Apollo', grade=79.23}
     * Student{id=3, name='Korry', grade=67.35}
     * Student{id=4, name='Lee', grade=46.23}
     * All Students:
     * Student{id=0, name='Ryan', grade=76.43}
     * Student{id=1, name='Justin', grade=45.78}
     * Student{id=2, name='Apollo', grade=79.23}
     * Student{id=4, name='Lee', grade=46.23}
     * Top student:
     * Student{id=2, name='Apollo', grade=79.23}
     *
     * Process finished with exit code 0
     */
    static void main() {
        ArrayList<Student> students = new ArrayList<>();
        // TODO: Add students to arraylist declared above
        students.add(new Student(0, "Ryan", 76.43));
        students.add(new Student(1, "Justin", 45.78));
        students.add(new Student(2, "Apollo", 79.23));
        students.add(new Student(3, "Korry", 67.35));
        students.add(new Student(4, "Lee", 46.23));

        // TODO: Print all students
        System.out.println("All Students:");
        for (Student s : students) {
            s.printStudent();
        }

        // TODO: Remove student by ID - remove one on 3rd
        students.removeIf(s -> s.getId() == 3);
        // TODO: Print all students after removing id 3
        System.out.println("All Students:");
        for (Student s : students) {
            s.printStudent();
        }
        // TODO: Find highest grade student
        Student topStudent = students.getFirst();
        for (Student s : students) {
            if (s.getGrade() > topStudent.getGrade()) {
                topStudent = s;
            }
        }
        System.out.println("Top student:");
        topStudent.printStudent();
    }
}
