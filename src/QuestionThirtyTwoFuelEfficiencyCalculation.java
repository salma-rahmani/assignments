/*
Question 32: Fuel Efficiency Calculation

    Create a double variable named distance and assign it the value 500.0 representing kilometers traveled.
    Create a double variable named fuelUsed and assign it the value 40.0 representing liters of fuel used.
    Calculate the fuel efficiency in kilometers per liter.
    Print the fuel efficiency.
 */
public class QuestionThirtyTwoFuelEfficiencyCalculation {
    public static void main(String[] args) {
        double distance = 500.0; // kilometers traveled
        double fuelUsed = 40.0;  // liters of fuel used
        double efficiency = distance / fuelUsed;
        System.out.println("Fuel efficiency (km per liter): " + efficiency);
    }
}

