/*
Question 3: Understanding Non-Primitive Data Types

Step 1: Creating a Class and Main Method

    Create a new Java class named NonPrimitiveTypesDemo.
    Inside the NonPrimitiveTypesDemo class, create a main method.

Step 2: Declaring Non-Primitive Variables

    Inside the main method, declare a String variable named stringVar and initialize it with the value "Hello World".
    Declare an Array of type int named intArray with values {1, 2, 3, 4, 5}.

Step 3: Printing Non-Primitive Variables

    Print the value of stringVar using System.out.println.
    Print the first element of intArray using System.out.println(intArray[0]).
 */
public class QuestionThreeNonPrimitiveTypesDemo {

    public static void main(String[] args) {
        String stringVar = "Hello World";
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println(" The value of stringVar is: " + stringVar);
        System.out.println(intArray[0]);


    }
}
