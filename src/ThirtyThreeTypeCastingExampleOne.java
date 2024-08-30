/*
Question 33: Type Casting Example 1

    Create a double variable named doubleValue and assign it the value 123.456.
    Perform explicit casting to convert doubleValue to an int variable named intValue.
    Print both doubleValue and intValue.
 */
public class ThirtyThreeTypeCastingExampleOne {
    public static void main(String[] args) {

        double doubleValue = 123.456;
        int intValue = (int) doubleValue;

        System.out.println(" The doubleNumber value is " + doubleValue + "\n" + " The value of intValue is: " + intValue);

    }
}
