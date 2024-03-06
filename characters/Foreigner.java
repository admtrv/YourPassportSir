package characters;

import objects.*;
public class Foreigner extends Visitor{
    private Visa visa;
    public Foreigner(String firstName, String lastName, Passport passport, Visa visa, boolean isDocumentValid) {
        super(firstName, lastName, passport, isDocumentValid);
        this.visa = visa;
    }

    public Visa getVisa() {
        return visa;
    }
}
