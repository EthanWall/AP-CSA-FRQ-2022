package q1;

public class Game {

    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    public Game() {}

    public boolean isBonus() { return false; }

    public void play() {}

    public int getScore() {
        Level[] allLevels = {levelOne, levelTwo, levelThree};
        int score = 0;

        for (Level level : allLevels) {
            if (!level.goalReached())
                break;

            score += level.getPoints();
        }

        if (isBonus())
            score *= 3;

        return score;
    }

    public int playManyTimes(int num) {
        int highestScore = 0;

        for (int i = 0; i < num; i++) {
            play();

            int gameScore = getScore();
            if (gameScore > highestScore)
                highestScore = gameScore;
        }

        return highestScore;
    }

}
