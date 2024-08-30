import java.util.Scanner;

/*
Question 41: Simple Addition

    Create a Scanner object to read input from the user.
    Ask the user to enter two integers and store them in int variables named num1 and num2.
    Calculate the sum of the two numbers.
    Print the sum.
 */
public class QuestionFortyOneSimpleAddition {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number:");
        num1 = input.nextInt();
        System.out.print("Please enter the second number:");
        num2 = input.nextInt();
        System.out.println("The first number is: "+ num1);
        System.out.println("The second number is: "+ num2);
        int sum = num1+num2;
        System.out.println(" The sum of two numbers is: " + sum);


    }
}
