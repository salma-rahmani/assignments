import java.util.Scanner;

/*
Question 51: Calculating BMI

    Create a Scanner object to read input from the user.
    Ask the user to enter their weight in kilograms and height in meters. Store these values in double variables named weight and height.
    Calculate the BMI using the formula: BMI = weight / (height * height).
    Print the BMI.
 */
public class QuestionFiftyOneCalculatingBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight;
        double height;
        double bmi;
        System.out.print("Please enter weight in kilograms: ");
        weight = input.nextDouble();

        System.out.print("Please enter the height in meters: ");
        height = input.nextDouble();

        System.out.println("The weight is " + weight + " kilograms");
        System.out.println("The height is " + height + " meters");
        bmi = weight / (height * height);
        System.out.println(" The BMI is: " +bmi);

    }
}
