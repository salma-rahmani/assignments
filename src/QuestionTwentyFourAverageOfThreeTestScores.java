/*
Question 24: Average of Three Test Scores

    Create three double variables named score1, score2, and score3 and assign them values like 85.5, 90.0, and 78.0.
    Calculate the average of these three scores.
    Print the average score.
 */
public class QuestionTwentyFourAverageOfThreeTestScores {
    public static void main(String[] args) {
        double score1 = 85.5, score2 = 90.0, score3 = 78.0;

        double average = (score1 + score2 + score3) / 3;
        System.out.println("The average score is: " + average);
    }
}
