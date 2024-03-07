package objects;

import java.time.LocalDate;

public class Passport extends Document {
    private String photo; // Возможно путь к файлу фотографии
    private LocalDate birthDate;
    private String country;
    private LocalDate expirationDate;
    private String passportNumber;
    private String sex;
    public Passport(String firstName, String lastName, String passportNumber, LocalDate birthDate, String country, LocalDate expirationDate, String photo,String sex) {
        super(firstName, lastName);
        this.photo = photo;
        this.birthDate = birthDate;
        this.country = country;
        this.expirationDate = expirationDate;
        this.passportNumber = passportNumber;
        this.sex = sex;

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

    public void displayPassport() {
        System.out.println("---Passport---");
        System.out.println("*" + photo + "* " + firstName + ", " + lastName);
        System.out.println("DOB. " + birthDate);
        System.out.println("SEX. " + sex);
        System.out.println("IC. " + country);
        System.out.println("EXP. " + expirationDate);
        System.out.println("---" + passportNumber + "---");
    }
}
