/*
Question 20: Calculating Total Price

    Create an int variable named quantity and assign it the value 5.
    Create a double variable named pricePerItem and assign it the value 20.75.
    Calculate the total price by multiplying quantity with pricePerItem.
    Print the total price.
 */
public class QuestionTwentyCalculatingTotalPrice {
    public static void main(String[] args) {
        // Declare and initialize variables
        int quantity = 5; // Number of items
        double pricePerItem = 20.75; // Price per item

        // Calculate the total price
        double total = quantity * pricePerItem;

        // Print the total price
        System.out.println("The total price is: $" + total);
    }
}

