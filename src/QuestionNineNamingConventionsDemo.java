/*
Question 9: Variable Naming Conventions

Step 1: Creating a Class and Main Method

    Create a new Java class named NamingConventionsDemo.
    Inside the NamingConventionsDemo class, create a main method.

Step 2: Declaring Variables with Correct Naming Conventions

    Inside the main method, declare an int variable named employeeAge and initialize it with the value 30.
    Declare a String variable named customerName and initialize it with "John Doe".

Step 3: Discussing Invalid Names

    Explain why variable names like 1stVariable, total-amount, and class are invalid in Java.

Step 4: Printing Valid Variables

    Print the values of employeeAge and customerName using System.out.println.
 */
public class QuestionNineNamingConventionsDemo {
    public static void main(String[] args) {
        int employeeAge = 30;
        String customerName = "John Doe";
        // int 1stVariable,  Variable names cannot begin with a digit.
        // int total-amount; Hyphens - are not allowed in variable names (Need to use underscores _ or camelCase instead).
        // String class; class is a reserved keyword in Java and cannot be used as a variable
        System.out.println(" The value of emloyeeAge is:"+ employeeAge + " The value of customerName is:"+ customerName);


    }
}
