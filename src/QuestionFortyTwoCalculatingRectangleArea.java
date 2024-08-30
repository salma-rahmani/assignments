import java.util.Scanner;

/*
Question 42: Calculating Rectangle Area

    Create a Scanner object to read input from the user.
    Ask the user to enter the length of a rectangle and store it in a double variable named length.
    Ask the user to enter the width of the rectangle and store it in a double variable named width.
    Calculate the area of the rectangle using the formula: Area = length * width.
    Print the area.
 */
public class QuestionFortyTwoCalculatingRectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length;
        double width;

        System.out.print("Please enter the length of the rectangle:");
        length = input.nextDouble();

        System.out.print("Please enter the width of the rectangle:");
        width = input.nextDouble();
        double area = length * width;

        System.out.println("The length of the rectangle is:" + length);
        System.out.println("The width of the rectangle is:" + width);
        System.out.println("The area of the rectangle is: " + area);


    }
}
