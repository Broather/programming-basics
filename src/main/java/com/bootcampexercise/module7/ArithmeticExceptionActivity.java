package com.bootcampexercise.module7;

public class ArithmeticExceptionActivity {
    /**
     * @author Markuss
     * @purpose catches an arithmetic exception
     * @output exception: / by zero
     * Thank you for using this program.
     * 5
     * Thank you for using this program.
     */
    static void main() {
        //TODO: 2  Create an instance of ArithmeticExceptionActivity and call catchMe with 10 and 0
        ArithmeticExceptionActivity a = new ArithmeticExceptionActivity();
        a.catchMe(10, 0);
        //TODO: 5- try to call catchMe with 10 and 2 now and see which messages get printed
        a.catchMe(10, 2);
    }

    void catchMe(int num1, int num2) {
        //The following code results in an Exception.
        //TODO: 3 - Identify the exception and write code to handle this exception.
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException a) {
            System.out.printf("exception: %s\n", a.getMessage());
        } finally {
            //TODO: 4 - After handling the exception, write a finally block which
            System.out.println("Thank you for using this program.");

        }


        }

}
