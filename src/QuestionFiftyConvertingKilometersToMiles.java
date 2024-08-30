import java.util.Scanner;

/*
Question 50: Converting Kilometers to Miles

    Create a Scanner object to read input from the user.
    Ask the user to enter a distance in kilometers and store it in a double variable named kilometers.
    Convert the distance to miles using the formula: Miles = kilometers * 0.621371.
    Print the distance in miles.
 */
public class QuestionFiftyConvertingKilometersToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilometers ;
        double miles ;
        System.out.print("Please enter the distance in kilometers: ");
        kilometers = input.nextDouble();
        miles = kilometers * 0.621371;
        System.out.println("The distance you entered is "+ kilometers);
        System.out.println("The distance is "+ miles +" miles");
    }
}
