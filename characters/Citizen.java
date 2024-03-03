package characters;

import objects.Passport;
import objects.PersonalCard;
public class Citizen extends Visitor{

    private PersonalCard personalCard;

    public Citizen(String firstName, String lastName, Passport passport, PersonalCard personalCard) {
        super(firstName, lastName, passport);
        this.personalCard = personalCard;
    }

    public PersonalCard getParsonalCard() {
        return personalCard;
    }
}
