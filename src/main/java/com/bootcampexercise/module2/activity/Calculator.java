package com.bootcampexercise.module2.activity;

/*
Calculator.java
Create 4 methods sum, subtract, multiply,divide,module

Call all 5 methods in main at least 1
 */
public class Calculator {
    public static final int CALC_TYPE_BASIC = 0;

    private final int calculatorType;
    /**
     * @author Markuss
     * @purpose representation of a calculator with all 4 basic math operations + modulo
     */
    static void main() {
        int a = 6, b = 7;
        Calculator c = new Calculator(Calculator.CALC_TYPE_BASIC);
        System.out.println("a + b = " + c.add(a,b));
        System.out.println("a - b = " + c.subtract(a,b));
        System.out.println("a * b = " + c.multiply(a,b));
        System.out.println("a / b = " + c.divide(a,b));
        System.out.println("a % b = " + c.module(a,b));
    }

    public Calculator(int calculatorType) {
        this.calculatorType = calculatorType;
    }

    public int getCalculatorType() {
        return calculatorType;
    }

    int add(int a, int b){
        return a + b;
    }
    int subtract(int a, int b){
        return a - b;
    }
    int multiply(int a, int b){
        return a * b;
    }
    int multiply(int[] arr){
        int result = 1;
        for (int a : arr){
            result *= a;
        }
        return result;
    }
    int divide(int a, int b){
        return a / b;
    }
    int module(int a, int b){
        return a % b;
    }
}
