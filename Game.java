public class Game {
    private GameLevel gameLevel;
    private GameDate gameDate;

    public Game() {
        this.gameLevel = new GameLevel(); // Устанавливаем начальный уровень
        this.gameDate = new GameDate(1973, 10, 28); // Устанавливаем начальную дату
    }


    public void run() {
        System.out.println("Welcome to passport control!");
        while (true) {
            System.out.println("Admission level: " + gameLevel.getLevel());
            System.out.println("Current date: " + gameDate.getCurrentDate().toString());
            System.out.println(gameLevel.getAccessRules());

            // Логика проверки документов и имитация результата работы игрока
            boolean playerPerformedWell = Math.random() > 0.5;

            if (playerPerformedWell) {
                if (gameLevel.getLevel() > 1) {
                    gameLevel.decreaseLevel();
                    System.out.println("Well done, officer! Clearance level's been lowered.");
                } else {
                    System.out.println("Excellent work, officer! You've been promoted and you're being reassigned to the administration.");
                    System.out.println("You win!");
                    break;
                }
            } else {
                if (gameLevel.getLevel() < 3) {
                    gameLevel.increaseLevel();
                    System.out.println("You've let criminals into the country! Security clearance has been upgraded.");
                } else {
                    System.out.println("Not a good job, officer! You've been demoted and you're going to an office work.");
                    System.out.println("Game over!");
                    break;
                }
            }

            gameDate.nextDay();
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}
