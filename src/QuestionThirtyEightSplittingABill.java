/*
Question 38: Splitting a Bill

    Create a double variable named totalBill and assign it the value 250.0.
    Create an int variable named numberOfPeople and assign it the value 5.
    Calculate the amount each person should pay by dividing totalBill by numberOfPeople.
    Print the amount each person should pay.
 */
public class QuestionThirtyEightSplittingABill {
    public static void main(String[] args) {
        double totalBill = 250.0;
        int numberOfPeople = 5;
        double amount = totalBill/numberOfPeople;
        System.out.println(" The amount each person should pay: "+ amount);


    }
}
