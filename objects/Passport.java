package objects;

import java.time.LocalDate;

public class Passport extends Document {
    private String photo; // Пока-что путь к файлу фотографии
    private LocalDate birthDate;
    private String country;
    private LocalDate expirationDate;

    public Passport(String firstName, String lastName, String passportNumber, LocalDate birthDate, String countryOfIssue, LocalDate expirationDate, String photo) {
        super(firstName, lastName, passportNumber);
        this.birthDate = birthDate;
        this.country = countryOfIssue;
        this.expirationDate = expirationDate;
        this.photo = photo;
    }

    // геттеры для objects.Passport
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getCountry() {
        return country;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public String getPhoto() {
        return photo;
    }
}
