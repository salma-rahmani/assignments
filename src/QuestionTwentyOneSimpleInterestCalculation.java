/*
Question 21: Simple Interest Calculation

    Create a double variable named principal and assign it the value 1000.0.
    Create a double variable named rate and assign it the value 5.5.
    Create an int variable named time and assign it the value 2.
    Calculate the simple interest using the formula: SimpleInterest = (principal * rate * time) / 100.
    Print the simple interest.
 */

public class QuestionTwentyOneSimpleInterestCalculation {
    public static void main(String[] args) {
        // Declare and initialize variables
        double principal = 1000.0; // Principal amount
        double rate = 5.5;         // Interest rate
        int time = 2;              // Time period in years

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the simple interest
        System.out.println("The simple interest is: " + simpleInterest);
    }
}


