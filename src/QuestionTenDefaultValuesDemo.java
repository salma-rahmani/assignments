/*
Question 10: Understanding Default Values of Variables

Step 1: Creating a Class and Main Method

    Create a new Java class named DefaultValuesDemo.
    Inside the DefaultValuesDemo class, create a main method.

Step 2: Declaring Instance Variables Without Initialization

    Inside the DefaultValuesDemo class but outside the main method, declare an int variable named defaultInt.
    Declare a boolean variable named defaultBoolean.

Step 3: Printing Default Values

    Inside the main method, create an object of DefaultValuesDemo.
    Print the default values of defaultInt and defaultBoolean using System.out.println.
 */
public class QuestionTenDefaultValuesDemo {
    int defaultInt;
    boolean defaultBoolean;

    public static void main(String[] args) {
        QuestionTenDefaultValuesDemo obj = new QuestionTenDefaultValuesDemo();

        // Printing default values
        System.out.println("Default value of defaultBoolean: " + obj.defaultBoolean);
        System.out.println("Default value of defaultInt: " + obj.defaultInt);
    }
}
