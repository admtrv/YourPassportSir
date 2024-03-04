package game;

import statistics.GameDate;
import statistics.GameLevel;
import statistics.GameScore;

import java.util.Timer;
import java.util.TimerTask;

public class Game {
    private GameLevel gameLevel;
    private GameDate gameDate;
    private GameScore gameScore;
    private Timer timeLimit;

    public Game() {
        this.gameLevel = new GameLevel(); // Устанавливаем начальный уровень
        this.gameDate = new GameDate(1983, 10, 28); // Устанавливаем начальную дату
        this.gameScore = new GameScore(); // Инициализация счетчика очков
        this.timeLimit = new Timer(); // Инициаизация таймера для ограничения игрового дня в 5 минут
    }

    private void startDay() {
        System.out.println("Current date: " + gameDate.getCurrentDate().toString());
        System.out.println("Admission level: " + gameLevel.getLevel() + " stars");
        System.out.println(gameLevel.getAccessRules());

        timeLimit = new Timer();
        timeLimit.schedule(new TimerTask() {
            @Override
            public void run() {
                // Логика, которая должна выполниться по истечении 5 минут
                endDay();
            }
        }, 1000); // Задаем таймер на 5 минут

        // Симуляция действий игрока в течение дня
        simulatePlayerActions();
    }

    private void simulatePlayerActions() {
        // Логика проверки документов и имитация результата работы игрока
        boolean playerPerformedWell = Math.random() > 0.5;

        if (playerPerformedWell) {
            gameScore.addPoints((int) (Math.random() * 100)); // Добавить очки за хорошую работу
            if (gameLevel.getLevel() > 1) {
                gameLevel.decreaseLevel();
                System.out.println("Well done, officer! Clearance level's been decreased.");
            } else {
                System.out.println("Excellent work, officer! You've been promoted and you're being reassigned to the administration.");
                gameScore.printTotalScore();
                System.exit(0); // Завершить день с победой
            }
        } else {
            if (gameLevel.getLevel() < 3) {
                gameLevel.increaseLevel();
                System.out.println("You've let criminals into the country! Security clearance has been increased.");
            } else {
                System.out.println("Not a good job, officer! You've been demoted and you're going to an office work.");
                gameScore.printTotalScore();
                System.exit(0); // Завершить день с поражением
            }
        }

    }

    private void endDay() {
        System.out.println("Time's up for today!");
        timeLimit.cancel();
        gameScore.endDay();
        gameDate.nextDay();
        startDay();
    }
    public void run() {
        System.out.println("Welcome to passport control!");
        startDay();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}
