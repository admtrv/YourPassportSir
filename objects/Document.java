package objects;

public abstract class Document {
    protected String firstName;
    protected String lastName;

    public Document(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Общие геттеры для всех документов
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
