package statistics;

public class GameScore {
    private int totalScore = 0; // Общий счет
    private int dailyScore = 0; // Счет за день

    // Добавляет очки к счету за день
    public void addPoints(int points) {
        dailyScore += points;
    }

    public void subtractPoints(int points) {dailyScore -= points;}

    // Выводит и добавляет счет за день к общему счету, затем сбрасывает счет за день
    public void endDay() {
        System.out.println("You've earned: " + dailyScore + " Eurodollars");
        totalScore += dailyScore;
        dailyScore = 0; // Сброс счета за день
    }

    // Выводит общий счет
    public void printTotalScore() {
        System.out.println("In total, you've earned: " + totalScore + " Eurodollars");
    }

}
