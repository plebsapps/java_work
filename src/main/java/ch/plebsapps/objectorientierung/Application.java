package ch.plebsapps.objectorientierung;

import java.util.Map;
import java.util.HashMap;

public class Application {

    public static void main(String[] args) {
        ProduktionDate pd = new ProduktionDate()
                .year(1988)
                .month(10);

        System.out.println(pd);
        System.out.println(Geschlecht.SACHLICH);

        Student studi = new Student();

        // Eine HashMap für Namen und Alter erstellen
        Map<String, Integer> namenAlterMap = new HashMap<>();
        //TODO HashMap

        // Daten zur HashMap hinzufügen
        namenAlterMap.put("Alice", 25);
        namenAlterMap.put("Bob", 30);
        namenAlterMap.put("Charlie", 28);
        namenAlterMap.put("David", 35);

        // Alter anhand des Namens abrufen
        String gesuchterName = "Bob";
        if (namenAlterMap.containsKey(gesuchterName)) {
            int alter = namenAlterMap.get(gesuchterName);
            System.out.println(gesuchterName + " ist " + alter + " Jahre alt.");
        } else {
            System.out.println("Name nicht gefunden.");
        }
    }
}