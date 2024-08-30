import java.util.Scanner;

/*
Question 48: Reading and Printing User's Age

    Create a Scanner object to read input from the user.
    Ask the user to enter their age and store it in an int variable named age.
    Print a message that includes the user's age (e.g., "You are 25 years old.").
 */
public class QuestionFortyEightReadingAndPrintingUserAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Please enter your age: ");
        age = input.nextInt();
        System.out.println("You are " + age + " years old.");

    }
}
