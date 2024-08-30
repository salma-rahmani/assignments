import java.util.Scanner;

/*
Question 49: Calculating Simple Interest

    Create a Scanner object to read input from the user.
    Ask the user to enter the principal amount, rate of interest, and time in years. Store these values in double variables named principal, rate, and time.
    Calculate the simple interest using the formula: SimpleInterest = (principal * rate * time) / 100.
    Print the simple interest.
 */

public class QuestionFortyNineCalculatingSimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double principal;
        double rate;
        double time;
        double simpleInterest;

        System.out.print("Please enter the principal amount: ");
        principal = input.nextDouble();

        System.out.print("Please enter the rate: ");
        rate = input.nextDouble();

        System.out.print("Please enter the time in years: ");
        time = input.nextDouble();

        System.out.println("The principal amount is " + principal);
        System.out.println("The rate is " + rate);
        System.out.println("The time is " + time);

        simpleInterest = (principal * rate * time) / 100;

        System.out.println("The simple interest is " + simpleInterest);

    }
}
