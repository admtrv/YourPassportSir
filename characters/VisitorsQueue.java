package characters;

import objects.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class VisitorsQueue {
    private List<Visitor> visitorsQueue = new ArrayList<>();
    private final int maxVisitorsPerDay = 5;

    public VisitorsQueue() {
        parseFile("characters/parse/сitizens.csv", true); // true для жителей
        parseFile("characters/parse/foreigners.csv", false); // false для заграничных посетителей
        Collections.shuffle(visitorsQueue); // Перемешиваем список после добавления всех посетителей
    }

    private void parseFile(String filePath, boolean isCitizen) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (isCitizen) {
                    // Создание объекта Citizen из строки файла
                    Citizen citizen = new Citizen(
                            data[0],
                            data[1],
                            new Passport(data[2], data[3], data[4], LocalDate.parse(data[5]), data[6], LocalDate.parse(data[7]), data[8], data[9]),
                            new IdentityCard(data[10], data[11], LocalDate.parse(data[12]), Integer.parseInt(data[13]), Integer.parseInt(data[14]), data[15]),
                            Boolean.parseBoolean(data[16])
                    );
                    visitorsQueue.add(citizen);
                } else {
                    // Создание объекта Foreigner из строки файла
                    Foreigner foreigner = new Foreigner(
                            data[0],
                            data[1],
                            new Passport(data[2], data[3], data[4], LocalDate.parse(data[5]), data[6], LocalDate.parse(data[7]), data[8], data[9]),
                            new Visa(data[10], data[11], data[12], LocalDate.parse(data[13])),
                            Boolean.parseBoolean(data[14])
                    );
                    visitorsQueue.add(foreigner);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Visitor> getVisitorsQueue() {
        return visitorsQueue;
    }

    public int getMaxVisitorsPerDay() {
        return maxVisitorsPerDay;
    }
}
