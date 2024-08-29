/*
Question 16: Variable Initialization Blocks

Step 1: Creating a Class and Main Method

    Create a new Java class named InitializationBlockDemo.
    Inside the InitializationBlockDemo class, create a main method.

Step 2: Declaring Variables and Initialization Blocks

    Inside the InitializationBlockDemo class, declare a static int variable named staticVar and an instance int variable named instanceVar.
    Create a static initialization block to set the value of staticVar to 50.
    Create an instance initialization block to set the value of instanceVar to 25.

Step 3: Printing Initialized Variables

    Inside the main method, print the value of staticVar.
    Create an object of InitializationBlockDemo and print the value of instanceVar.
 */
public class QuestionSixteenInitializationBlockDemo {
    // Step 2: Declaring variables
    static int staticVar;
    int instanceVar;

    // Static initialization block
    // If I don't mention static before the block so the value will be 0
    static {
        staticVar = 50;
    }

    // Instance initialization block
    {
        instanceVar = 25;
    }

    public static void main(String[] args) {
        // Printing the static variable
        System.out.println("Static Variable: " + QuestionSixteenInitializationBlockDemo.staticVar);

        // Creating an object and printing the instance variable
        QuestionSixteenInitializationBlockDemo obj = new QuestionSixteenInitializationBlockDemo();
        System.out.println("Instance Variable: " + obj.instanceVar);
    }
}
