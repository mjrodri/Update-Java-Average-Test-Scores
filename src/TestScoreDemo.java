import java.util.Scanner;

public class TestScoreDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the usr to enter three test scores
        System.out.println("Enter the first test score:");
        int score1 = scanner.nextInt();
        System.out.println("Enter the second test score:");
        int score2 = scanner.nextInt();
        System.out.println("Enter the third test score:");
        int score3 = scanner.nextInt();

        // TestScores object using entered scores
        TestScores testScores = new TestScores(score1, score2, score3);

        // Display the Average test scores
        System.out.println("Average test score: " + testScores.getAverage());

        scanner.close();
    }
}
