package com.bootcampexercise.module10;

/**
 * @author Markuss
 * @purpose Calculator class with 4 different mathematical operations
 */
public class Calculator {

    int add(int a, int b){
        return a + b;
    }
    int add(int[] arr){
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result;
    }
    int subtract(int a, int b){
        return a - b;
    }
    int divide(int a, int b) {
        if (b == 0){ throw new IllegalArgumentException(); }

        try{
            return a / b;
        } catch (ArithmeticException e){
            System.out.println("Exception: "+e.getMessage());
            return -1;
        }
    }
    int multiply(int a, int b){
        return a * b;
    }
}
