/*
    Question 1: Understanding Variables in Java

Step 1: Creating a Class and Main Method

    Create a new Java class named VariableDemo.
    Inside the VariableDemo class, create a main method.

Step 2: Declaring and Initializing Class-Level (Static) Variables

    Inside the VariableDemo class but outside the main method, declare a static variable classLevelVar of type int and initialize it with the value 10.

Step 3: Declaring and Initializing Instance Variables

    Inside the VariableDemo class but outside the main method, declare an instance variable instanceVar of type String and initialize it with the value "Hello".

Step 4: Declaring and Initializing Local Variables

    Inside the main method, declare a local variable localVar of type double and initialize it with the value 20.5.

Step 5: Modifying and Printing Variables

    Inside the main method, modify the value of localVar to 30.5.
    Print the value of localVar using System.out.println.
    Print the value of classLevelVar using System.out.println.
    To access the instance variable instanceVar, create an object of the VariableDemo class and print instanceVar using System.out.println.
     */
public class QuestionOneVariableDemo {

    // Step 2: Declaring and Initializing Class-Level (Static) Variable
    static int classLevelVar = 10;

    // Step 3: Declaring and Initializing Instance Variable
    String instanceVar = "Hello";

    public static void main(String[] args) {

        // Step 4: Declaring and Initializing Local Variable
        double localVar = 20.5;

        // Step 5: Modifying and Printing Variables
        localVar = 30.5;
        System.out.println("The value of localVar is: " + localVar);
        System.out.println("The value of classLevelVar is: " + classLevelVar);

        // Creating an object to access the instance variable
        QuestionOneVariableDemo obj = new QuestionOneVariableDemo();
        System.out.println("The value of instanceVar is: " + obj.instanceVar);
    }
}