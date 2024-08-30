import java.util.Scanner;

/*
Question 43: Converting Celsius to Fahrenheit

    Create a Scanner object to read input from the user.
    Ask the user to enter a temperature in Celsius and store it in a double variable named celsius.
    Convert the temperature to Fahrenheit using the formula: Fahrenheit = (celsius * 9/5) + 32.
    Print the temperature in Fahrenheit.
 */
public class QuestionFortyThreeConvertingCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double celsius;
        System.out.print(" Please enter a temperature in Celsius:");
        celsius= input.nextDouble();
        System.out.println(" The temperature that you entered is: "+ celsius+ "°C");
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(" This temperature in fahrenheit is:" + fahrenheit +"°F");


    }
}
