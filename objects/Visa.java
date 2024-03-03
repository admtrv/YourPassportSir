package objects;

import java.time.LocalDate;

public class Visa extends Document {
    private String passportNumber;
    private LocalDate entranceDate;

    public Visa(String firstName, String lastName, String passportNumber, LocalDate entranceDate) {
        super(firstName, lastName);
        this.passportNumber = passportNumber;
        this.entranceDate = entranceDate;
    }

    // Геттеры для Visa
    public LocalDate getEntranceDate() {
        return entranceDate;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
}
