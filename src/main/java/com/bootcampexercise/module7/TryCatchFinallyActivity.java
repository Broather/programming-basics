package com.bootcampexercise.module7;

public class TryCatchFinallyActivity {
    /**
     * @author Markuss
     * @purpose catch an exception and print its message
     * @output exception: Index 43 out of bounds for length 10
     * this message gets printed out whether or not an error occurred
     *
     * Process finished with exit code 0
     */
    static void main() {
        // TODO: call catchmeifyoucan
        catchMeIfYouCan();
    }

    static void catchMeIfYouCan() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //TODO: use try and in interaction of array put condition i<=10 instead of <10

        try {
            arr[43] = 21;
            //TODO: create catch for try and use IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException exception) {
            //TODO: In catch create custom System.out.println message
            System.out.printf("exception: %s\n", exception.getMessage());
        } finally {
            //TODO: Use method that this message gets printed out whether or not error has occurred
            System.out.println("this message gets printed out whether or not an error occurred");

        }
    }
}