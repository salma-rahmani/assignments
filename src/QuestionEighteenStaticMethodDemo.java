/*
Question 18: Understanding Static Methods and Variables

Step 1: Creating a Class and Main Method

    Create a new Java class named StaticMethodDemo.
    Inside the StaticMethodDemo class, create a main method.

Step 2: Declaring a Static Variable and Method

    Inside the StaticMethodDemo class, declare a static int variable named counter.
    Create a static method named incrementCounter that increments counter by 1 and prints its value.

Step 3: Calling Static Method*

    Inside the main method, call incrementCounter twice and observe the value of counter.
 */
public class QuestionEighteenStaticMethodDemo {
    // Step 2: Declaring a static variable
    static int counter;

    // Step 2: Creating a static method
    static void incrementCounter() {
        counter++;
        System.out.println("The value of counter is: " + counter);
    }

    public static void main(String[] args) {
        // Step 3: Calling static method twice
        incrementCounter(); // First call  --> 1
        incrementCounter(); // Second call --> 2
        // Since counter is a static variable, it is not reset to 0 with each call.
        // Instead, it retains its value between method calls.
        // Therefore, when you call the method a second time,
        // it continues from the value it had after the first call.
    }
}