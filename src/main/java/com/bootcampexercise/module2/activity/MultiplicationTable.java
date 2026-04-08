package com.bootcampexercise.module2.activity;

public class MultiplicationTable {
    /**
     * @author Markuss
     * @purpose call the defined 'printTable' method to print a multiplication table from 11 to 20
     */
    static void main() {
        printTable(11, 20);
    }
    /**
     * @author Markuss
     * @purpose prints a multiplication table with given lower and upper boundaries
     */
    static void printTable(int lower, int upper){
        if (lower > upper) {
            System.out.println("lower boundary cannot be greater than the upper boundary");
            return;
        }
        for (int i = lower; i <= upper; i++) {
            for (int j = lower; j <= upper; j++) {
                System.out.printf("%d ", i*j);
            }
                System.out.println();
        }
    }
}
