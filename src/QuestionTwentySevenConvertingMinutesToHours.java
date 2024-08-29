/*
Question 27: Converting Minutes to Hours and Minutes

    Create an int variable named totalMinutes and assign it the value 135.
    Calculate the number of hours and the remaining minutes.
    Print the result in the format X hours and Y minutes.
 */
public class QuestionTwentySevenConvertingMinutesToHours {
    public static void main(String[] args) {
        int totalMinutes = 135;
        // Since 120 minutes is 2 hours and it is 135 minutes, so we need to calculate the remaining minutes

        int toHours = totalMinutes / 60;
        int toMinutes = totalMinutes % 60;

        System.out.println(totalMinutes + " minutes is " + toHours + " hours and " + toMinutes + " minutes.");
    }
}
