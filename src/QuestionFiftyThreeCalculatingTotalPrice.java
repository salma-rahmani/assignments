import java.util.Scanner;

/*
Question 53: Calculating Total Price

    Create a Scanner object to read input from the user.
    Ask the user to enter the quantity of items and the price per item. Store these values in int and double variables named quantity
     and pricePerItem.
    Calculate the total price by multiplying quantity with pricePerItem.
    Print the total price.
 */
public class QuestionFiftyThreeCalculatingTotalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantity;
        double pricePerItem;
        System.out.print("please enter the quantity of items:");
        quantity = input.nextInt();
        System.out.print("please enter the price per item:");
        pricePerItem = input.nextDouble();
        System.out.println("the quantity that you entered is " + quantity);
        System.out.println("the price per item that you entered is " + pricePerItem);
        double total = quantity * pricePerItem;
        System.out.println("The total price is $" + total);


    }
}
