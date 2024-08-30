/*
Question 39: Calculating Circle Properties

    Create a double variable named radius and assign it the value 7.5.
    Calculate the area and circumference of the circle using the formulas:
        Area = Math.PI * radius * radius
        Circumference = 2 * Math.PI * radius
    Print the area and circumference.
 */
public class QuestionThirtyNineCalculatingCircleProperties {
    public static void main(String[] args) {
        double radius= 7.5;
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println(" The area is: "+ area +"\n "+ "The circumference is:"+ circumference);

    }
}
