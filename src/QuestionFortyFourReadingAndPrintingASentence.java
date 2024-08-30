import java.util.Scanner;

/*
Question 44: Reading and Printing a Sentence

    Create a Scanner object to read input from the user.
    Ask the user to enter a sentence and store it in a String variable named sentence.
    Print the sentence back to the user.
 */
public class QuestionFortyFourReadingAndPrintingASentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;
        System.out.print("Please type your sentence:");
        sentence = input.nextLine();
        System.out.println("The sentence that you typed is: "+ sentence);}
}
