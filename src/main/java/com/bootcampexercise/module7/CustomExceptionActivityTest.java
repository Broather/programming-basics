package com.bootcampexercise.module7;

//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.
public class CustomExceptionActivityTest {
    /**
     * @author Markuss
     * @purpose prints a custom exception message if username not valid
     * @output Welcome to Payroll program, John
     * exception: You are not allowed to use this program
     *
     * Process finished with exit code 0
     */
    static void main() {
        try {
            validateUser("John");
            validateUser("Bryan");

        } catch (CustomExceptionActivity exception){
            System.out.printf("exception: %s\n", exception.getMessage());
        }
    }


    static void validateUser(String name) throws CustomExceptionActivity{
        //array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
//flag stores 1 if a match is found else it should remain 0
        int flag = 0;
        for (int i = 0; i < 4; i++) {
//2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly
            if(name.equals(validUsers[i])){
                flag = 1;
                break;
            }
        }
//3 - check if flag is zero, throw CustomExceptionActivity Exception.
        if (flag == 0){
            throw new CustomExceptionActivity();
        } else {
            System.out.printf("Welcome to Payroll program, %s\n", name);
        }
//You may also have to declare this exception in the method call using throws.


//4 - else if flag is one, print a message "Welcome to Payroll program".

    }
}
