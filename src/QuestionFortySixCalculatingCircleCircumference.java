import java.util.Scanner;

/*
Question 46: Calculating Circle Circumference

    Create a Scanner object to read input from the user.
    Ask the user to enter the radius of a circle and store it in a double variable named radius.
    Calculate the circumference using the formula: Circumference = 2 * Math.PI * radius.
    Print the circumference.
 */
public class QuestionFortySixCalculatingCircleCircumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.print("Please enter the radius of circle:");
        radius = input.nextDouble();
        System.out.println("The radius that you entered is: "+radius );
        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference is: "+ circumference);

    }
}
