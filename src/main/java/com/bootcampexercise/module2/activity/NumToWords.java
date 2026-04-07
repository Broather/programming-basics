package com.bootcampexercise.module2.activity;

public class NumToWords {
    /**
     * @author Markuss
     * @purpose call the defined method `switchCaseEx` with different arguments
    */
    static void main() {
        switchCaseEx(5); // Activity 4
        switchCaseEx(100); // Variation for default section execution
        switchCaseEx(1);
    }

    /**
     * @author Markuss
     * @purpose print the English name of a given integer if it's within the defined range
     */
    private static void switchCaseEx(int a) {
        int lower = 1, upper = 10;
        switch (a) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            case 10:
                System.out.println("TEN");
                break;
            default:
                System.out.printf("Given value is not in the range %d-%d\n", lower, upper);
        }
    }
}
