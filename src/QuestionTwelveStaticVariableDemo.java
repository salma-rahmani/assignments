/*
Question 12: Understanding Static Variables

Step 1: Creating a Class and Main Method

    Create a new Java class named StaticVariableDemo.
    Inside the StaticVariableDemo class, create a main method.

Step 2: Declaring a Static Variable

    Inside the StaticVariableDemo class, declare a static int variable named counter.

Step 3: Incrementing and Printing Static Variable

    Inside the main method, increment the counter variable by 1.
    Print the value of counter using System.out.println.
    Create a new object of StaticVariableDemo and increment the counter variable again. Print the value of counter.
 */
public class QuestionTwelveStaticVariableDemo {
    // Declaring a static variable named 'counter'
    static int counter;

    public static void main(String[] args) {
        // Increment the static variable 'counter' by 1
        counter++;
        // Print the current value of 'counter'
        System.out.println("Counter after first increment: " + counter);

        // Create an object of the class
        QuestionTwelveStaticVariableDemo obj = new QuestionTwelveStaticVariableDemo();
        // Increment the static variable 'counter' by 1 again
        counter++;
        // Print the current value of 'counter' after second increment
        System.out.println("Counter after second increment: " + counter);
    }
}