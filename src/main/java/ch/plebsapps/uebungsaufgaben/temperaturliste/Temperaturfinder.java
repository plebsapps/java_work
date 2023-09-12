package ch.plebsapps.uebungsaufgaben.temperaturliste;

import java.util.List;

public class Temperaturfinder {

    public static void main(String[] args) {
        // Beispielaufruf der Methode mit einer Liste von Temperaturen
        List<Double> temperaturen = List.of(10.5, -2.3, 3.8, 1.2, 5.0, -1.2);
        double naechsteTemperatur = findeNaechsteTemperatur(temperaturen);
        System.out.println("Die naheliegendste Temperatur ist: " + naechsteTemperatur);
    }

    public static double findeNaechsteTemperatur(List<Double> temperaturen) {
        if (temperaturen == null || temperaturen.isEmpty()) {
            throw new IllegalArgumentException("Die Liste der Temperaturen darf nicht leer sein.");
        }

        double naechsteTemperatur = temperaturen.get(0); // Annahme: Die erste Temperatur ist die naheliegendste

        for (double temperatur : temperaturen) {
            // Wenn die aktuelle Temperatur näher an 0 liegt als die bisherige "naechsteTemperatur",
            // aktualisiere "naechsteTemperatur".

            if (Math.abs(temperatur) < Math.abs(naechsteTemperatur) ||
                    (Math.abs(temperatur) == Math.abs(naechsteTemperatur) && temperatur > 0)) {
                naechsteTemperatur = temperatur;
            }
        }

        return naechsteTemperatur;
    }
}
