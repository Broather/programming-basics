package com.bootcampexercise.module2.activity;

public class AddWholeNum {
    /**
     * @author Markuss
     * @purpose sum together 50 + 51 + 52 ... + 100 and print the result
     */
    static void main() {
        int sum = 0;
        for (int i = 50; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
