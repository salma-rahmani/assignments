import java.util.Scanner;

/*
Question 47: Dividing Two Numbers

    Create a Scanner object to read input from the user.
    Ask the user to enter two double values and store them in variables named num1 and num2.
    Calculate the result of dividing num1 by num2.
    Print the result.
 */
public class QuestionFortySevenDividingTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;

        System.out.print("Please enter the first number: ");
        num1 = input.nextDouble();
        System.out.print("Please enter the second number: ");
        num2 = input.nextDouble();
        System.out.println("The first number is " + num1);
        System.out.println("The second number is " + num2);

        double result = num1 / num2;
        if (num2 != 0) {
            System.out.println(" The result of dividing these two numbers is: " + result);
        }
        else
            System.out.println(" please enter another number instead of zero");


    }
}
