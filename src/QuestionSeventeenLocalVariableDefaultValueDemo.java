/*
Question 17: Understanding Default Values for Local Variables

Step 1: Creating a Class and Main Method

    Create a new Java class named LocalVariableDefaultValueDemo.
    Inside the LocalVariableDefaultValueDemo class, create a main method.

Step 2: Declaring Local Variables without Initialization

    Inside the main method, declare an int variable named uninitializedInt.

Step 3: Attempting to Print Uninitialized Local Variables

    Try to print the value of uninitializedInt using System.out.println and observe the compilation error.

Step 4: Initializing and Printing Local Variables

    Initialize uninitializedInt with the value 0 and print its value using System.out.println.
 */
public class QuestionSeventeenLocalVariableDefaultValueDemo {
    public static void main(String[] args) {
        int name;
        //System.out.println(name);
        // this is the compilation error before initializing the name variable "variable name might not have been initialized"

        name = 0;
        System.out.println(" The value of name is: " + name);
    }
}
