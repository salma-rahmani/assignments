/*
Question 35: Calculating Compound Interest

    Create a double variable named principalAmount and assign it the value 2000.0.
    Create a double variable named annualRate and assign it the value 4.5.
    Create an int variable named years and assign it the value 5.
    Calculate the compound interest using the formula: Amount = principalAmount * Math.pow((1 + annualRate/100), years).
    Print the amount.
 */
public class QuestionThirtyFiveCalculatingCompoundInterest {
    public static void main(String[] args) {

        double principalAmount = 2000.0;
        double annualRate = 4.5;
        int years = 5;
        double amount = principalAmount * Math.pow((1 + annualRate / 100), years);
        System.out.println("The compound amount after " + years + " years is: " + amount);

    }
}

