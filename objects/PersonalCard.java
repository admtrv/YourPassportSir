package objects;

import java.time.LocalDate;

public class PersonalCard extends Document{
    private String photo; // Возможно путь к файлу фотографии
    private LocalDate birthDate;
    private int height;
    private int weight;

    public PersonalCard(String firstName, String lastName, LocalDate birthDate,int height , int weight, String photo) {
        super(firstName, lastName);
        this.photo = photo;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;

    }

    // Геттеры для Passport
    public String getPhoto() {
        return photo;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
