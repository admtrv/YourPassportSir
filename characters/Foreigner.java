package characters;

import objects.Passport;
import objects.Visa;

public class Foreigner extends Visitor{
    private Visa visa;
    public Foreigner(String firstName, String lastName, Passport passport, Visa visa) {
        super(firstName, lastName, passport);
        this.visa = visa;
    }

    public Visa getVisa() {
        return visa;
    }
}
