/*
Question 25: Distance Between Two Points

    Create two double variables named x1 and y1 representing the coordinates of the first point, and assign them the values 4.0 and 3.0.
    Create two more double variables named x2 and y2 representing the coordinates of the second point, and assign them the values 6.0 and 7.0.
    Calculate the distance between these two points using the formula: Distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)).
    Print the distance.
 */
public class QuestionTwentyFiveDistanceBetweenTwoPoints {
    public static void main(String[] args) {
        double x1 = 4.0;
        double y1 = 3.0;
        double x2 = 6.0;
        double y2 = 7.0;

        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("The distance is: " + distance);
    }
}
