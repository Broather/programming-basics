package com.bootcampexercise.module8;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

    private Student student;
    public void setUp() throws Exception {
        super.setUp();
        student = new Student(1212, "James", 45.23);
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetId() {
        assertEquals(1212, student.getId());
    }

    public void testSetId() {
        student.setId(2121);
        assertEquals(2121, student.getId());
    }

    public void testTestGetName() {
        assertEquals("James", student.getName());
    }

    public void testTestSetName() {
        student.setName("Billy");
        assertEquals("Billy", student.getName());
    }

    public void testGetGrade() {
        assertEquals(45.23, student.getGrade());
    }

    public void testSetGrade() {
        student.setGrade(43.65);
        assertEquals(43.65, student.getGrade());
    }
}