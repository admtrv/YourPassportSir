package objects;

public abstract class Document {
    protected String firstName;
    protected String lastName;
    protected String passportNumber;

    public Document(String firstName, String lastName, String passportNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
    }

    // Общие геттеры для всех документов
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
}
