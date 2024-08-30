import java.util.Scanner;

/*
Question 54: Reading and Concatenating Strings

    Create a Scanner object to read input from the user.
    Ask the user to enter their first name and store it in a String variable named firstName.
    Ask the user to enter their last name and store it in a String variable named lastName.
    Concatenate the first name and last name with a space in between.
    Print the full name.
 */
public class QuestionFiftyFourReadingAndConcatenatingStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstname;
        String lastName;
        System.out.print("Please enter you first name: ");
        firstname = input.next();
        System.out.print("Please enter your last name: ");
        lastName = input.next();

        System.out.println("Your first name is: "+firstname);
        System.out.println("Your last name is: "+ lastName);
        String fullName = firstname +" "+ lastName;
        System.out.println("Your full name is: "+ fullName);
    }
}
