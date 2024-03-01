import java.time.LocalDate;

public class GameDate {
    private LocalDate currentDate;

    // Конструктор для инициализации начальной даты
    public GameDate(int year, int month, int day) {
        this.currentDate = LocalDate.of(year, month, day);
    }

    // Метод для перехода к следующему дню
    public void nextDay() {
        currentDate = currentDate.plusDays(1);
    }

    // Геттер для получения текущей даты
    public LocalDate getCurrentDate() {
        return currentDate;
    }

}
