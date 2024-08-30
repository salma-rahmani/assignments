/*
Question 36: Temperature Conversion (Fahrenheit to Celsius)

    Create a double variable named fahrenheit and assign it the value 98.6.
    Convert the temperature to Celsius using the formula: Celsius = (fahrenheit - 32) * 5/9.
    Print the temperature in Celsius.
 */
public class QuestionThirtySixTemperatureConversionFahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(" The temperature in Celsius is: " + celsius);

    }
}
