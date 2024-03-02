package objects;

import java.time.LocalDate;

public class Visa extends Document {
    private LocalDate entranceDate;

    public Visa(String firstName, String lastName, String passportNumber, LocalDate entranceDate) {
        super(firstName, lastName, passportNumber);
        this.entranceDate = entranceDate;
    }

    // Геттер для поля expiryDate
    public LocalDate getEntranceDate() {
        return entranceDate;
    }
}
