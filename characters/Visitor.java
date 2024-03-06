package characters;

import objects.*;
public abstract class Visitor {
    protected String firstName;
    protected String lastName;
    protected Passport passport;
    protected boolean isDocumentValid;
    public Visitor(String firstName, String lastName, Passport passport, boolean isDocumentValid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passport = passport;
        this.isDocumentValid = isDocumentValid;
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

    public boolean checkDocumentValid() {
        return isDocumentValid;
    }
}