package ch.plebsapps.lambda;

import java.util.Comparator;
import java.util.function.ToIntFunction;

/**
 *  Lernziel: Compatator-Excemplare aufbauen und verketten
 *  - Statische Methoden zum Aufbau neuer Comparator-Exemplare, Key-Extractor
 *  - Comparator-Exemplare verketten
 */
public class JavaFunctinalComparator {
    public static void main(String[] args) {
        //comparatorenErste();
       // comparatorenZweiter(); // Mit keyExtractor
        comparatorenDritte();  // keyExtractor inline
    }

    //TODO Video 100 lernen

    private static void comparatorenDritte() {
        Comparator<Country> countryPopo = Comparator.comparingInt(country1 -> country1.population);
        Comparator<Country> countryArea = Comparator.comparingDouble(country -> country.area);
        Comparator<Country> countryName = Comparator.comparing(country -> country.name);
    }

    private static void comparatorenZweiter() {
        ToIntFunction<Country> keyExtractor = country -> country.population;

        Comparator<Country> countryPopo = Comparator.comparingInt(keyExtractor);
    }

    //Erstes Beispiel aber recht umständlich... .
    private static void comparatorenErste() {
        Comparator<Country> comparatorName = (c1, c2) -> c1.name.compareTo(c2.name);
        Comparator<Country> comparatorArea = (c1, c2) -> Double.compare(c1.area, c2.area);
        Comparator<Country> comparatorPop = (c1, c2) -> Integer.compare(c1.population, c2.population);

        //Dynamisch aufgebauter Comperator -> Wenn Flache gleich dann Population dann Name
        // dieses könnte man beliebig ändern
        Comparator<Country> countryComparator = comparatorArea.thenComparing(comparatorPop).thenComparing(comparatorName);
    }
}

class Country {
    String name;
    double area;
    int population;
}