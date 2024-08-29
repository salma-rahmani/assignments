/*
Question 22: Converting Celsius to Fahrenheit

    Create a double variable named celsius and assign it the value 25.0.
    Convert the temperature to Fahrenheit using the formula: Fahrenheit = (celsius * 9/5) + 32.
    Print the temperature in Fahrenheit.
 */
public class QuestionTwentyTwoConvertingCelsiusToFahrenheit {
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = (celsius * 9/5) + 32; // Convert Celsius to Fahrenheit
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }
}