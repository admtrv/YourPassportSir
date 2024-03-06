package characters;

import objects.*;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class VisitorsQueue {
    private List<Visitor> visitorsQueue = new ArrayList<>();
    private final int maxVisitorsPerDay = 5;
    public VisitorsQueue() {
        generateQueue();
    }

    private void generateQueue() {
        // Граждане United Federation of Libertania (UFL)
        visitorsQueue.add(new Citizen("John", "Doe", new Passport("John", "Doe", "UFL001", LocalDate.of(1990, 4, 1), "United Federation of Libertania", LocalDate.of(2030, 4, 1), "photoPath1"), new PersonalCard("John", "Doe", LocalDate.of(1990, 4, 1), 180, 80, "photoPath1"),true));
        visitorsQueue.add(new Citizen("Alice", "Doe", new Passport("Alice", "Doe", "UFL002", LocalDate.of(1992, 7, 24), "United Federation of Libertania", LocalDate.of(2032, 7, 24), "photoPath2"), new PersonalCard("Alice", "Doe", LocalDate.of(1992, 7, 24), 165, 60, "photoPath2"),true));

        // Berkestan
        visitorsQueue.add(new Foreigner("Aidar", "Nazarbayev", new Passport("Aidar", "Nazarbayev", "BER001", LocalDate.of(1988, 1, 15), "Berkestan", LocalDate.of(2028, 1, 15), "photoPath3"), new Visa("Aidar", "Nazarbayev", "BER001", LocalDate.of(2023, 12, 31)),true));
        visitorsQueue.add(new Foreigner("Dana", "Kerey", new Passport("Dana", "Kerey", "BER002", LocalDate.of(1994, 11, 5), "Berkestan", LocalDate.of(2024, 11, 5), "photoPath4"), new Visa("Dana", "Kerey", "BER002", LocalDate.of(2023, 12, 31)),true));

        // Volgaria
        visitorsQueue.add(new Foreigner("Ivan", "Petrov", new Passport("Ivan", "Petrov", "VOL001", LocalDate.of(1986, 5, 22), "Volgaria", LocalDate.of(2026, 5, 22), "photoPath5"), new Visa("Ivan", "Petrov", "VOL001", LocalDate.of(2023, 12, 31)),true));
        visitorsQueue.add(new Foreigner("Olga", "Sidorova", new Passport("Olga", "Sidorova", "VOL002", LocalDate.of(1990, 3, 18), "Volgaria", LocalDate.of(2030, 3, 18), "photoPath6"), new Visa("Olga", "Sidorova", "VOL002", LocalDate.of(2023, 12, 31)),true));

        // Miong Gu
        visitorsQueue.add(new Foreigner("Li", "Wang", new Passport("Li", "Wang", "MIO001", LocalDate.of(1979, 9, 29), "Miong Gu", LocalDate.of(2029, 9, 29), "photoPath7"), new Visa("Li", "Wang", "MIO001", LocalDate.of(2023, 12, 31)),true));
        visitorsQueue.add(new Foreigner("Chen", "Yu", new Passport("Chen", "Yu", "MIO002", LocalDate.of(1983, 2, 14), "Miong Gu", LocalDate.of(2033, 2, 14), "photoPath8"), new Visa("Chen", "Yu", "MIO002", LocalDate.of(2023, 12, 31)),true));

        // Vielfraschland
        visitorsQueue.add(new Foreigner("Hans", "Muller", new Passport("Hans", "Müller", "VIE001", LocalDate.of(1975, 6, 3), "Vielfraschland", LocalDate.of(2025, 6, 3), "photoPath9"), new Visa("Hans", "Müller", "VIE001", LocalDate.of(2023, 12, 31)),true));
        visitorsQueue.add(new Foreigner("Anna", "Schmidt", new Passport("Anna", "Schmidt", "VIE002", LocalDate.of(1988, 12, 21), "Vielfraschland", LocalDate.of(2028, 12, 21), "photoPath10"), new Visa("Anna", "Schmidt", "VIE002", LocalDate.of(2023, 12, 31)),true));
    }

    public ArrayList<Visitor> getVisitorsQueue() {
        return new ArrayList<>(visitorsQueue);
    }

    public int getMaxVisitorsPerDay() {
        return maxVisitorsPerDay;
    }
}
