package characters;

import objects.*;
public class Citizen extends Visitor{

    private IdentityCard identityCard;

    public Citizen(String firstName, String lastName, Passport passport, IdentityCard identityCard, boolean isDocumentValid) {
        super(firstName, lastName, passport, isDocumentValid);
        this.identityCard = identityCard;
    }

    public IdentityCard getIdentityCard() {
        return identityCard;
    }
}
