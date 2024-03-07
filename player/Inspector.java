package player;

import characters.*;

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
            citizen.getPassport().displayPassport();
            citizen.getIdentityCard().displayPersonalCard();
        } else if (visitor instanceof Foreigner) {
            Foreigner foreigner = (Foreigner) visitor;
            System.out.println(visitor.getFirstName() + " " + visitor.getLastName()+": Hello! I'm a foreigner.");
            foreigner.getPassport().displayPassport();
            foreigner.getVisa().displayVisa();
        }

        return getPlayerDecision();
    }

    private boolean getPlayerDecision() {
        System.out.println("Do you want to allow entry? (yes/no)");
        String decision = scanner.nextLine();
        return decision.equalsIgnoreCase("yes");
    }
}
