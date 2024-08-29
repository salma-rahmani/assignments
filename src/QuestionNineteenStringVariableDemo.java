/*
Question 20: Working with String Variables

Step 1: Creating a Class and Main Method

    Create a new Java class named StringVariableDemo.
    Inside the StringVariableDemo class, create a main method.

Step 2: Declaring and Initializing String Variables

    Inside the main method, declare a String variable named firstName and initialize it with "John".
    Declare another String variable named lastName and initialize it with "Doe".

Step 3: Concatenating Strings

    Concatenate firstName and lastName with a space in between and store the result in a new String variable named fullName.

Step 4: Printing Concatenated Strings

    Print the value of fullName using System.out.println.
 */
public class QuestionNineteenStringVariableDemo {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(" The Full Name is: "+ fullName);
    }
}
