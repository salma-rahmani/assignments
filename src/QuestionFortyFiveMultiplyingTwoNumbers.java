import java.util.Scanner;

/*
Question 45: Multiplying Two Numbers

    Create a Scanner object to read input from the user.
    Ask the user to enter two double values and store them in variables named num1 and num2.
    Calculate the product of the two numbers.
    Print the product.
 */
public class QuestionFortyFiveMultiplyingTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        System.out.print("Please enter the first number:");
        num1 = input.nextDouble();


        System.out.print("Please enter the second number:");
        num2 = input.nextDouble();
        System.out.println("The first number is: " + num1);
        System.out.println("The second number is: " + num2);
        double product = num1 * num2;
        System.out.println("The product of two numbers is: "+ product);

    }
}
