package characters;

import objects.Passport;

public abstract class Visitor {
    protected String firstName;
    protected String lastName;
    protected Passport passport;

    public Visitor(String firstName, String lastName, Passport passport) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passport = passport;
    }

    // Общие геттеры для всех Посетителей
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Passport getPassport() {
        return passport;
    }
}