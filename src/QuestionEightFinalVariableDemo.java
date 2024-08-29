/*
Question 8: Using Final Variables

Step 1: Creating a Class and Main Method

    Create a new Java class named FinalVariableDemo.
    Inside the FinalVariableDemo class, create a main method.

Step 2: Declaring Final Variables

    Inside the main method, declare a final variable of type int named MAX_VALUE and initialize it with the value 100.

Step 3: Attempting to Modify Final Variables

    Try to modify the value of MAX_VALUE and observe the compilation error.

Step 4: Printing Final Variables

    Print the value of MAX_VALUE using System.out.println.
 */

public class QuestionEightFinalVariableDemo {
    public static void main(String[] args) {
        final int MAX_Value = 100;

        //MAX_Value = 200;

        System.out.println(MAX_Value);
        // the compilation error is this " cannot assign a value to final variable MAX_Value".

    }
}
