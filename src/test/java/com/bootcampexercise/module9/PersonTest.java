package com.bootcampexercise.module9;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
    private Person person;
    public void setUp() throws Exception {
        super.setUp();
        person = new Person();
        person.setHeight(1.75f);
        person.setWeight(70);
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetWeight() {
        assertEquals(70, person.getWeight());
    }

    public void testSetWeight() {
        person.setWeight(69);
        assertEquals(69, person.getWeight());
    }

    public void testGetHeight() {
        assertEquals(1.75f, person.getHeight());
    }

    public void testSetHeight() {
        person.setHeight(1.80f);
        assertEquals(1.80f, person.getHeight());
    }

    public void testCalculateBMI() {
        assertEquals("Person's BMI is 22.86", person.calculateBMI());
    }
}