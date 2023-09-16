package ch.plebsapps.lambda;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Lernziel: Funktionale Programmierung mit 'Optional'
 * - ifPresent(...)
 * - Oder- Alternativen
 * - map(...) und faltMap(...)
 */
public class JavaFunctionalOptional99 {
    public static void main(String[] args) {

        //beispielKeineSchoeneKette();
        beispielMitOptional();
        //beispielMap();
        //beispielFlatMap();
        //TODO flatMap() und map()??
    }

    private static void beispielFlatMap() {
        List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        List<Integer> flatList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatList);

    }

    private static void beispielMap() {
        List<String> words = Arrays.asList("Hello", "Worl");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(wordLengths);
    }

    private static void beispielMitOptional() {
        Company company = new Company();

        // MIT Zeilenumbrüche besser Lesbar!
        String maybeFirstEntry =
                company.boss().flatMap(Boss::secretary)                                     //  mit methoden Reference
                        .flatMap(secretary -> secretary.calendar())                         // ohne
                        .flatMap(calendar -> calendar.firstEntryOfDay())                    // ohne
                        .filter(s-> !s.isEmpty())                                           // .filter
                        // .or( () -> Optional.of("YOGA"));                                 // or() -> liefert einen Optonal zurück
                        // .orElse("YOGA");                                                 // orElse() -> Falls nichts liefert er den String "YOGA"
                        // .orElseGet(() -> "YOGA");                                        // orElseGet() -> wie orElse() aber billiger.
                        .orElseThrow(() -> new IllegalStateException("Fehlnder Eintrag"));
    }

    // ---  SO AM BESTEN NICHT ----
    //diese Kette wäre sehr ungelenk
    private static void beispielKeineSchoeneKette() {
        /*
        Company company = new Company();

        //HIER könnte in der Kette ja immer ein NULL sein
        String entry = company.boss().secretary().calendar().firstEntryOfDay();

        if(company != null){
            if (company.boss() != null) {
                if(company.boss().secretary() != null){
                    //etc....
                }
            }
        }
        */
    }
}


class Company {
    private Boss boss;

    public Optional<Boss> boss() {
        return Optional.ofNullable(boss);
    }
}

class Boss {
    private Secretary secretary;

    public Optional<Secretary> secretary() {
        return Optional.ofNullable(secretary);
    }
}

class Secretary {
    private Calendar calendar;

    public Optional<Calendar> calendar() {
        return Optional.ofNullable(calendar);
    }
}

class Calendar {
    private String firstEntryOfDay = "";

    Optional<String> firstEntryOfDay() {
        return Optional.ofNullable(firstEntryOfDay);
    }
}