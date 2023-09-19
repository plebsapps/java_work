package ch.plebsapps.javaselib;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;


public class DateTimeApi {
    public static void main(String[] args) {

        //localDateObjekte();
        //localDateRechnen();

        //localDateErgaenzen();

        //geburstagWochenTag();
        //datentypenTagMonatJahr();
        //periode();
        //duration();

        //instant();
        //formatFuerDate();

        darstellungArtLaenderZeiten();
    }

    private static void darstellungArtLaenderZeiten() {

        //Hier wird alle Localen einstellungen die Java kennt die Zeitformate ausgegeben?
        for (Locale local : Locale.getAvailableLocales()){
            System.out.println(local.getDisplayCountry());
            System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(local)));

            System.out.println();
        }
    }

    private static void formatFuerDate() {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now.format(DateTimeFormatter.ISO_DATE));
    }

    private static void instant() {
        // Aktuellen Zeitpunkt erfassen
        Instant now = Instant.now();
        System.out.println("Aktueller Zeitpunkt: " + now);

        // Einen früheren Zeitpunkt durch Subtraktion einer Dauer erstellen
        Instant fiveHoursAgo = now.minus(Duration.ofHours(5));
        System.out.println("5 Stunden zuvor: " + fiveHoursAgo);

        // Einen zukünftigen Zeitpunkt durch Hinzufügen einer Dauer erstellen
        Instant inThreeHours = now.plus(Duration.ofHours(3));
        System.out.println("In 3 Stunden: " + inThreeHours);
    }

    private static void duration() {
        //Duration Zeit 24 Stunden
        // Zwei Uhrzeiten erstellen
        LocalTime time1 = LocalTime.of(8, 30);  // 8:30 Uhr
        LocalTime time2 = LocalTime.of(14, 45); // 14:45 Uhr

        // Die Differenz zwischen den beiden Uhrzeiten berechnen
        Duration duration = Duration.between(time1, time2);

        // Das Ergebnis ausgeben
        System.out.println("Stunden zwischen den Uhrzeiten: " + duration.toHours());
        System.out.println("Minuten zwischen den Uhrzeiten: " + duration.toMinutesPart());
        System.out.println("Sekunden zwischen den Uhrzeiten: " + duration.toSecondsPart());

        // Eine bestimmte Dauer hinzufügen
        LocalTime newTime = time1.plus(Duration.ofHours(6).plusMinutes(15));
        System.out.println("Neue Uhrzeit nach Hinzufügen von 6 Stunden und 15 Minuten: " + newTime);

    }

    private static void periode() {
        //Period
        // Zwei Daten erstellen
        LocalDate date1 = LocalDate.of(2020, 1, 1);
        LocalDate date2 = LocalDate.of(2023, 9, 18);

        // Die Differenz zwischen den beiden Daten berechnen
        Period period = Period.between(date1, date2);

        // Das Ergebnis ausgeben
        System.out.println("Jahre zwischen den Daten: " + period.getYears());
        System.out.println("Monate zwischen den Daten: " + period.getMonths());
        System.out.println("Tage zwischen den Daten: " + period.getDays());

        // Ein bestimmtes Zeitraum hinzufügen
        LocalDate newDate = date1.plus(Period.of(2, 5, 10));
        System.out.println("Neues Datum nach Hinzufügen von 2 Jahren, 5 Monaten und 10 Tagen: " + newDate);
    }

    private static void datentypenTagMonatJahr() {
        //DatenTypen wie
        //Year
        //Month
        //YearMonth
        System.out.println(Year.isLeap(2000));  // SchaltJahr ?
        System.out.println(YearMonth.of(2023, 12));
        System.out.println(Month.APRIL);
    }

    private static void geburstagWochenTag() {
        System.out.println("Der Geburtstag war" + LocalDateTime.of(1965, 12, 13, 12, 00).getDayOfWeek());
    }

    private static void localDateErgaenzen() {
        System.out.println(LocalDate.now().atTime(10, 12));

        //Mit Offset
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.atOffset(ZoneOffset.ofHours(+2)));

        //Mit Zone ID
        System.out.println(now.atZone(ZoneId.of("Europe/Berlin")));
    }

    private static void localDateRechnen() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.minusHours(1));
        System.out.println(now.minusDays(100));
        System.out.println(now.plusDays(100));
    }

    private static void localDateObjekte() {

        System.out.println(LocalDate.now());                                      //*.now
        System.out.println(LocalDate.of(2023, 4, 22));      //*.of

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getHour());
        System.out.println(now.getNano());
        System.out.println(now.getDayOfWeek());

        System.out.println(now.withHour(15));
    }
}