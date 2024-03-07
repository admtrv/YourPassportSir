package game;

import statistics.*;
import characters.*;
import player.*;

import java.util.Scanner;

public class Game {
    private Scanner scanner;
    private GameLevel gameLevel;
    private GameDate gameDate;
    private GameScore gameScore;
    private Inspector inspector;
    private VisitorsQueue visitorsQueue;
    private int currentVisitor = 0;
    int correctDecisions = 0;

    public Game() {
        this.scanner = new Scanner(System.in);
        this.gameLevel = new GameLevel();
        this.gameDate = new GameDate(1983, 10, 28);
        this.gameScore = new GameScore();
        this.visitorsQueue = new VisitorsQueue();
        this.inspector = new Inspector();
    }

    private void startDay() {
        System.out.println("Current date: " + gameDate.getCurrentDate().toString());
        System.out.println("Admission level: " + gameLevel.getLevel() + " stars");
        System.out.println(gameLevel.getAccessRules());

        playerActions();
    }

    private void playerActions() {
        int visitorsCheckedToday = 0;
        while (currentVisitor < visitorsQueue.getVisitorsQueue().size() && visitorsCheckedToday < visitorsQueue.getMaxVisitorsPerDay()) {

            Visitor visitor = visitorsQueue.getVisitorsQueue().get(currentVisitor);

            boolean decision = inspector.inspectVisitor(visitor);
            boolean isAllowedByLevel = gameLevel.checkLevel(visitor);
            boolean isDocumentValid = visitor.checkDocumentValid();

            // Правильность решения основывается на сочетании валидности документов и правил уровня
            if ((decision && isDocumentValid && isAllowedByLevel)  || (!decision && (!isDocumentValid || !isAllowedByLevel))) {
                System.out.println("(Correct decision)");
                gameScore.addPoints((int) (Math.random() * 10));
                correctDecisions++;
            } else {
                System.out.println("(Incorrect decision)");
                gameScore.subtractPoints((int) (Math.random() * 5));
            }

            currentVisitor++;
            visitorsCheckedToday++;
        }

        endDay();
    }

    private void endDay() {
        System.out.println("Day is over! You've correctly checked " + correctDecisions + " out of " + visitorsQueue.getMaxVisitorsPerDay() + " visitors today.");

        if (correctDecisions == visitorsQueue.getMaxVisitorsPerDay()) {
                gameLevel.decreaseLevel();
                System.out.println("Excellent work, officer! Clearance level's been decreased.");
        } else if (correctDecisions <= 2) {
                gameLevel.increaseLevel();
                System.out.println("That's a poor job, officer! Clearance level's been increased.");
        } else {
            System.out.println("Keep working, officer. Clearance level hasn't changed!");
        }

        correctDecisions = 0;
        gameDate.nextDay();

        if (currentVisitor < visitorsQueue.getVisitorsQueue().size()) {
            gameScore.endDay();
            System.out.println("Moving on to the next day? (yes/no)");
            String decision = scanner.nextLine();
            if (decision.equalsIgnoreCase("yes")) {
                startDay();
            }
        } else {
            System.out.println("Good job, officer! You've checked the entire visitor's queue");
            gameScore.printTotalScore();
            System.exit(0);
        }
    }

    public void run() {
        System.out.println("Welcome to passport control of the \"United Federation of Libertania\"!");
        startDay();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}
