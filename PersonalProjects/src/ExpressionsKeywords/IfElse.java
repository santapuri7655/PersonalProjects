package ExpressionsKeywords;

public class IfElse {
    public static void main(String[] args) {

        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        boolean gameOver = true;
        int score = 10000;
        int levelComplete = 8;
        int bonus = 200;

        if(score < 10000 && score > 1000) {
            System.out.println("your score was less than 5000 and greater than 1000");
        }
        else if(score < 1000) {
            System.out.println("your score is less than 1000");
        }
        else {
            System.out.println("got here");
        }

        if(gameOver) {
            int finalScore = score + (levelComplete * 5);
            System.out.println("your final score was " + finalScore);
        }
    }
}
