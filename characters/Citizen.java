package characters;

import objects.*;
public class Citizen extends Visitor{

    private PersonalCard personalCard;

    public Citizen(String firstName, String lastName, Passport passport, PersonalCard personalCard, boolean isDocumentValid) {
        super(firstName, lastName, passport, isDocumentValid);
        this.personalCard = personalCard;
    }

    public PersonalCard getPersonalCard() {
        return personalCard;
    }
}
