package com.bootcampexercise.module2.activity;

public class FindLargest {

    /**
     * @author Markuss
     * @purpose declare three variables and print the largest of them using the defined `myMax` method
     */
    static void main() {
        int x = 10, y = 88, z = 2;
         System.out.println(myMax(x,y,z));
    }
    /**
     * @author Markuss
     * @purpose loop through all given numbers using the Varargs feature of java and reassign `currentMax` if a number is greater than it
     */
    static int myMax(int... numbers){
        int currentMax = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > currentMax) {
                currentMax = number;
            }
        }
        return currentMax;
    }
}
