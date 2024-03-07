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


    public void displayVisa() {
        System.out.println("---Visa---");
        System.out.println("Entry to the");
        System.out.println("United Federation of Libertania");
        System.out.println("is hereby granted to:");
        System.out.println(lastName + " " + firstName);
        System.out.println("bearing passport number:");
        System.out.println(passportNumber);
        System.out.println("Enter by: " + entranceDate);
        System.out.println("----------");
    }

}
