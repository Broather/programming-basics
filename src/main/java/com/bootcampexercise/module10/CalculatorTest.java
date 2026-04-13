package com.bootcampexercise.module10;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator c;
    private int[] singleDigit, twoDigit;


    public void setUp() throws Exception {
        super.setUp();
        c = new Calculator();
        singleDigit = new int[]{1,2,3,4,5};
        twoDigit = new int[]{11,21,31,41,51};
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }
    public void testAdd() {
        assertEquals(4, c.add(2,2));
        assertEquals(4, c.add(3,1));
        assertEquals(15, c.add(singleDigit));
        assertEquals(155, c.add(twoDigit));
    }

    public void testSubtract() {
        assertEquals(0, c.subtract(2,2));
        assertEquals(2, c.subtract(3,1));
    }

    public void testDivide() {
        try{
            assertEquals(1, c.divide(2,2));
            assertEquals(2, c.divide(2,1));
            assertEquals(-1, c.divide(3,0));
        } catch (IllegalArgumentException e){
            // TODO: do something
        }
    }

    public void testMultiply() {
        assertEquals(4, c.multiply(2, 2));
        assertEquals(-4, c.multiply(2, -2));
        assertEquals(4, c.multiply(-2, -2));
        assertEquals(0, c.multiply(1, 0));
    }
}