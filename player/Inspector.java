package player;

import characters.*;
import objects.*;

import java.util.Scanner;

public class Inspector {
    private Scanner scanner;

    public Inspector() {
        this.scanner = new Scanner(System.in);
    }

    public boolean inspectVisitor(Visitor visitor) {
        if (visitor instanceof Citizen) {
            Citizen citizen = (Citizen) visitor;
            System.out.println(visitor.getFirstName() + " " + visitor.getLastName()+": Hello! I'm a citizen.");
            displayPassport(citizen.getPassport());
            displayPersonalCard(citizen.getPersonalCard());
        } else if (visitor instanceof Foreigner) {
            Foreigner foreigner = (Foreigner) visitor;
            System.out.println(visitor.getFirstName() + " " + visitor.getLastName()+": Hello! I'm a foreigner.");
            displayPassport(foreigner.getPassport());
            displayVisa(foreigner.getVisa());
        }

        return getPlayerDecision();
    }

    private void displayPassport(Passport passport) {
        System.out.println("---Passport---");
        System.out.println("Photo: " + passport.getPhoto());
        System.out.println("First Name: " + passport.getFirstName());
        System.out.println("Last Name: " + passport.getLastName());
        System.out.println("Birth Date: " + passport.getBirthDate());
        System.out.println("Country: " + passport.getCountry());
        System.out.println("Expiration Date: " + passport.getExpirationDate());
        System.out.println("Passport Number: " + passport.getPassportNumber());
        System.out.println("--------------");
    }

    private void displayPersonalCard(PersonalCard personalCard) {
        System.out.println("---Personal Card---");
        System.out.println("Photo: " + personalCard.getPhoto());
        System.out.println("First Name: " + personalCard.getFirstName());
        System.out.println("Last Name: " + personalCard.getLastName());
        System.out.println("Birth Date: " + personalCard.getBirthDate());
        System.out.println("Height: " + personalCard.getHeight() + " cm");
        System.out.println("Weight: " + personalCard.getWeight() + " kg");
        System.out.println("-------------------");
    }

    private void displayVisa(Visa visa) {
        System.out.println("---Visa---");
        System.out.println("First Name: " + visa.getFirstName());
        System.out.println("Last Name: " + visa.getLastName());
        System.out.println("Passport Number: " + visa.getPassportNumber());
        System.out.println("Entrance Date: " + visa.getEntranceDate());
        System.out.println("----------");
    }

    private boolean getPlayerDecision() {
        System.out.println("Do you want to allow entry? (yes/no)");
        String decision = scanner.nextLine();
        return decision.equalsIgnoreCase("yes");
    }
}
