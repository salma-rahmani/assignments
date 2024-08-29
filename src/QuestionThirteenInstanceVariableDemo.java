/*
Question 13: Understanding Instance Variables

Step 1: Creating a Class and Main Method

    Create a new Java class named InstanceVariableDemo.
    Inside the InstanceVariableDemo class, create a main method.

Step 2: Declaring and Initializing Instance Variables

    Inside the InstanceVariableDemo class but outside the main method, declare an int variable named instanceCounter and initialize it with 0.

Step 3: Modifying Instance Variables through Objects

    Inside the main method, create two objects of InstanceVariableDemo.
    Increment the instanceCounter variable for each object.
    Print the value of instanceCounter for each object.
 */
public class QuestionThirteenInstanceVariableDemo {
    // Declare and initialize an instance variable 'instanceCounter'
    int instanceCounter = 0;

    public static void main(String[] args) {
        // Create two objects of the current class
        QuestionThirteenInstanceVariableDemo objOne = new QuestionThirteenInstanceVariableDemo();
        QuestionThirteenInstanceVariableDemo objTwo = new QuestionThirteenInstanceVariableDemo();

        // Increment the 'instanceCounter' variable for each object
        objOne.instanceCounter++;
        objTwo.instanceCounter++;

        // Print the 'instanceCounter' for each object
        System.out.println("Instance counter for objOne: " + objOne.instanceCounter);
        System.out.println("Instance counter for objTwo: " + objTwo.instanceCounter);
    }
}

