/*
Question 4: Variable Scope in Java

Step 1: Creating a Class and Main Method

    Create a new Java class named VariableScopeDemo.
    Inside the VariableScopeDemo class, create a main method.

Step 2: Declaring Variables with Different Scopes

    Inside the VariableScopeDemo class but outside the main method, declare a String variable named globalVar and initialize it with "Global".
    Inside the main method, declare a String variable named localVar and initialize it with "Local".

Step 3: Creating a Method to Demonstrate Scope

    Inside the VariableScopeDemo class, create a method named printVariables that prints the value of globalVar.
    Call printVariables inside the main method.

Step 4: Printing Variables

    Print the value of localVar inside the main method.
    Discuss what happens if you try to print localVar inside the printVariables method.

*/
public class QuestionFourVariableScopeDemo {
    // Step 2: Declaring Variables with Different Scopes
    static String globalVar = "Global";

    public static void main(String[] args) {
        // Step 2: Declaring a local variable
        String localVar = "Local";

        // Step 3: Call the method to demonstrate scope
        printVariables();

        // Step 4: Print the value of localVar inside the main method
        System.out.println("The value of localVar is: " + localVar);
    }

    // Step 3: Creating a Method to Demonstrate Scope
    public static void printVariables() {
        // This method can access globalVar
        System.out.println("The value of globalVar is: " + globalVar);

        // Attempting to access localVar here will result in a compilation error
        // because localVar is not visible in this method.
    }
}