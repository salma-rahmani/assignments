/*
Question 31: Area and Perimeter of a Rectangle

    Create two double variables named length and width and assign them the values 5.0 and 3.0.
    Calculate the area and perimeter of the rectangle.
    Print the area and perimeter.
 */
public class QuestionThirtyOneAreaAndPerimeterOfARectangle {
    public static void main(String[] args) {

        double length = 5.0;
        double width = 3.0;
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

    }
}
