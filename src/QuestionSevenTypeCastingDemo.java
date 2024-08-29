/*
Question 7: Type Casting in Java

Step 1: Creating a Class and Main Method

    Create a new Java class named TypeCastingDemo.
    Inside the TypeCastingDemo class, create a main method.

Step 2: Declaring and Initializing Variables

    Inside the main method, declare a double variable named doubleVar and initialize it with the value 50.5.

Step 3: Implicit and Explicit Casting

    Perform implicit casting by declaring an int variable named intVar and assigning it the value of doubleVar.
    Perform explicit casting by declaring a short variable named shortVar and explicitly casting doubleVar to short.

Step 4: Printing the Results of Casting

    Print the values of doubleVar, intVar, and shortVar using System.out.println.
 */

public class QuestionSevenTypeCastingDemo {

    public static void main(String[] args) {

        // Step 2: Declaring and Initializing Variables
        double doubleVar = 50.5;

        // Step 3: Implicit and Explicit Casting
        int intVar = (int) doubleVar;    // Explicit casting from double to int
        short shortVar = (short) doubleVar;  // Explicit casting from double to short
        // Implicit casting happens automatically when converting from a smaller type to a larger type (like int to double).
        // Since we are casting from double to int and short, it requires explicit casting as shown in your code.


        // Step 4: Printing the Results of Casting
        System.out.println("The value of doubleVar is: " + doubleVar);
        System.out.println("The value of intVar is: " + intVar);
        System.out.println("The value of shortVar is: " + shortVar);
    }
}