import java.util.Scanner;

/*
Question 52: Adding Three Numbers

    Create a Scanner object to read input from the user.
    Ask the user to enter three int values and store them in variables named num1, num2, and num3.
    Calculate the sum of the three numbers.
    Print the sum.
 */
public class QuestionFiftyTwoAddingThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.print(" Please enter the first number: ");
        num1 = input.nextInt();
        System.out.print(" Please enter the second number: ");
        num2 = input.nextInt();
        System.out.print(" Please enter the third number: ");
        num3 = input.nextInt();

        System.out.println(" The first number you entered is: " + num1);
        System.out.println(" The second number you entered is: " + num2);
        System.out.println(" The third number you entered is: " + num3);

        int sum = num1 + num2 + num3;
        System.out.println(" The sum of these numbers is: "+ sum);


    }
}
