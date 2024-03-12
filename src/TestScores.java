
// Instance to store tst scores.
public class TestScores {
    private int score1;
    private int score2;
    private int score3;

    // Constructor to Initialize  test scores.
    public TestScores(int score1, int score2, int score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    // Method to Average Test Scores
    public double getAverage() {
        return (score1 + score2 + score3) / 3.0;
    }

    // Mutator methods
    public void setScore1(int score1) {
        this.score1 = score1;
    }
// Mutator methods
    public void setScore2(int score2) {
        this.score2 = score2;
    }
// Mutator Methods
    public void setScore3(int score3) {
        this.score3 = score3;
    }
}