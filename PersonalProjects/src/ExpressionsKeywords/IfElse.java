package ExpressionsKeywords;

public class IfElse {
    public static void main(String[] args) {

        // Print out a second score1 on the screen with the following
        // score1 set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        int totalScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your total score is " + totalScore);

        totalScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your total score is " + totalScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        else
            return -1;
    }
}
