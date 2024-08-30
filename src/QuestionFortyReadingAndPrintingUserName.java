import java.util.Scanner;

/*
Question 40: Reading and Printing User's Name

    Create a Scanner object to read input from the user.
    Ask the user to enter their first name and store it in a String variable named firstName.
    Ask the user to enter their last name and store it in a String variable named lastName.
    Print a greeting message that includes the user's full name (e.g., "Hello, John Doe!").
 */
public class QuestionFortyReadingAndPrintingUserName {
    public static void main(String[] args) {
        String firstName;
        String lastName;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your First Name:");
        firstName = input.next();

        System.out.print("Please enter your Last Name:");
        lastName = input.next();

        System.out.println(" Hello, " + firstName + " "+ lastName);


    }
}
