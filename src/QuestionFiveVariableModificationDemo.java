/*
Question 5: Modifying and Updating Variables

Step 1: Creating a Class and Main Method

    Create a new Java class named VariableModificationDemo.
    Inside the VariableModificationDemo class, create a main method.

Step 2: Declaring and Initializing Variables

    Inside the main method, declare an int variable named num and initialize it with the value 10.
    Declare a String variable named greeting and initialize it with "Hello".

Step 3: Modifying Variables

    Modify the value of num to 20.
    Append " World" to the greeting variable.

Step 4: Printing Modified Variables

    Print the values of num and greeting using System.out.println.
 */
public class QuestionFiveVariableModificationDemo {
    public static void main(String[] args) {
        // Step 2: Declaring and Initializing Variables
        int num = 10;
        String greeting = "Hello";

        // Step 3: Modifying Variables
        num = 20;
        greeting = greeting + " World";

        // Step 4: Printing Modified Variables
        System.out.println("The value of num is: " + num + " and the value of greeting is: " + greeting);
    }
}
