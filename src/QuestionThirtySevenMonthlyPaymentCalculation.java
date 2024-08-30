/*
Question 37: Monthly Payment Calculation

    Create a double variable named loanAmount and assign it the value 15000.0.
    Create a double variable named annualInterestRate and assign it the value 3.5.
    Create an int variable named loanTermYears and assign it the value 5.
    Calculate the monthly payment using the formula: monthlyPayment = (loanAmount * (annualInterestRate/100) / 12).
    Print the monthly payment.
 */
public class QuestionThirtySevenMonthlyPaymentCalculation {
    public static void main(String[] args) {
        double loanAmount = 15000.0;
        double annualInterestRate = 3.5;
        int loanTermYears= 5;
        double monthlyPayment = (loanAmount * (annualInterestRate/100) / 12);
        System.out.println(" The monthly payment is: "+ monthlyPayment);

    }
}
