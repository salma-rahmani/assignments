/*
Question 30: Grocery Shopping Calculation

    Create int variables named apples and bananas to store the quantities of apples and bananas bought, assigning them values like 3 and 6.
    Create double variables named pricePerApple and pricePerBanana and assign them values like 0.50 and 0.30.
    Calculate the total cost for the apples and bananas.
    Print the total cost.
 */
public class QuestionThirtyGroceryShoppingCalculation {
    public static void main(String[] args) {
        int apples = 3;
        int bananas = 6;
        double pricePerApple = 0.50;
        double pricePerBanana = 0.30;

        double priceOfApples = apples * pricePerApple;
        double priceOfBananas = bananas * pricePerBanana;

        double totalCost = priceOfApples + priceOfBananas;

        System.out.println("The total cost is: " + totalCost);
    }
}
