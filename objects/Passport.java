package objects;

import java.time.LocalDate;

public class Passport extends Document {
    private String photo; // Возможно путь к файлу фотографии
    private LocalDate birthDate;
    private String country;
    private LocalDate expirationDate;
    private String passportNumber;

    public Passport(String firstName, String lastName, String passportNumber, LocalDate birthDate, String country, LocalDate expirationDate, String photo) {
        super(firstName, lastName);
        this.photo = photo;
        this.birthDate = birthDate;
        this.country = country;
        this.expirationDate = expirationDate;
        this.passportNumber = passportNumber;

    }

    // Геттеры для Passport
    public String getPhoto() {
        return photo;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getCountry() {
        return country;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
}
