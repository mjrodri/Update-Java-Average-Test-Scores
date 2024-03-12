import java.util.Scanner;

public class TestScoreAverage {

    // Method 1: calcAverage - Calculates the tests scores input by user and calculates avg.
    public static double calcAverage(int score1, int score2, int score3) {
        return (score1 + score2 + score3) / 3.0;
    }

    // Method 2: determineGrade - Based on grade scale below determines a letter grade for each test score input
    public static char determineGrade(int score) {
        char grade;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare scores directly within main
        int score1, score2, score3;

        // Prompt user to enter scores
        System.out.println("Enter first test score...");
        score1 = scanner.nextInt();
        System.out.println("Enter second test score...");
        score2 = scanner.nextInt();
        System.out.println("Enter third test score...");
        score3 = scanner.nextInt();

        // Calculate grade and average
        double average = calcAverage(score1, score2, score3);
        System.out.println("First Test Score: " + determineGrade(score1));
        System.out.println("Second Test Score: " + determineGrade(score2));
        System.out.println("Third Test Score: " + determineGrade(score3));
        System.out.println("Average: " + average);

        scanner.close();

    }
}