package statistics;

import characters.*;
public class GameLevel {
    private int level;

    // Начальный уровень
    public GameLevel() {
        this.level = 3;
    }

    public int getLevel() {
        return level;
    }

    public void increaseLevel() {
        if (level < 3) level+=1;
    }

    public void decreaseLevel() {
        if (level > 1) level-=1;
    }

    public String getAccessRules() {
        return switch (level) {
            case 3 ->
                    ("Rules of the day: Only citizens of the \"United Federation of Libertania\" with a valid passport and personal card will be admitted.");
            case 2 ->
                    ("Rules of the day: Entry is allowed for citizens of neighboring adjoining countries with a valid passport and visa.");
            case 1 ->
                    ("Rules of the day: Entry is allowed for citizens of all countries with a valid passport and visa.");
            default -> ("Error!");
        };
    }

    public boolean checkLevel(Visitor visitor) {
        return switch (level) {
            case 3 ->
                // Для 3 уровня допускаются только граждане UFL
                    visitor instanceof Citizen;
            case 2 ->
                // Для 2 уровня допускаются граждане Berkestan или Vielfraschland
                    visitor instanceof Foreigner && (visitor.getPassport().getCountry().equals("Berkestan") || visitor.getPassport().getCountry().equals("Vielfraschland"));
            case 1 ->
                // Для 1 уровня допускаются все посетители
                    true;
            default -> false;
        };
    }

}
