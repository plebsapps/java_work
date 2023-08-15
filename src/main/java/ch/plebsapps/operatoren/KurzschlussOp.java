package ch.plebsapps.operatoren;


/**
 * Eine wichtige Eigenschaft der booleschen Operatoren && , || , and und or ist die sogenannte Kurzschluss-Auswertung.
 *
 * Das bedeutet, dass diese Operatoren den rechten Operanden nicht ermitteln,
 * wenn auf Grund des linken Operanden das Ergebnis bereits feststeht.
 *
 * Zwei fälle sind hier festzuhalten:
 * 1. false1 && Bedingung2: Hier wird Bedingung2 nicht mehr ausgewertet oder überprüft, da es offensichtlich ist, dass die gesamte Bedingung falsch ist, sobald die erste Bedingung (false1) falsch ist.
 * 2. true1 || Bedingung2: Auch hier wird Bedingung2 nicht mehr ausgewertet oder überprüft, da es offensichtlich ist, dass die gesamte Bedingung ture ist, sobald die erste Bedingung (ture1) true ist.
 *
 * Folgend ein Beispiel:
 */
public class KurzschlussOp {

    public static void main(String[] args) {

        //TODO
        System.out.println("NICHT KURZSCHLUSS");
        System.out.println("-------------------------------------------------------");
        System.out.println("Nicht Kurzschluss1: " + (test1(true) & test2(true) & test3(true)) + "\n" );
        System.out.println("Nicht Kurzschluss2: " + (test1(false) & test2(false) & test3(false)) + "\n" );
        System.out.println("Nicht Kurzschluss3: " + (test1(true) | test2(true) | test3(true)) + "\n" );
        System.out.println("Nicht Kurzschluss4: " + (test1(false) | test2(false) | test3(false)) + "\n" );

        System.out.println("KURZSCHLUSS");
        System.out.println("-------------------------------------------------------");
        System.out.println("Kurzschluss1: " + (test1(true) && test2(true) && test3(true)) + "\n" );
        System.out.println("Kurzschluss2: " + (test1(false) && test2(false) && test3(false)) + "\n" );
        System.out.println("Kurzschluss3: " + (test1(true) || test2(true) || test3(true)) + "\n" );
        System.out.println("Kurzschluss4: " + (test1(false) || test2(false) || test3(false)) + "\n" );
    }

    private static boolean test1(boolean ret){
        System.out.println("test1");
        return ret;
    }

    private static boolean test2(boolean ret){
        System.out.println("test2");
        return ret;
    }

    private static boolean test3(boolean ret){
        System.out.println("test3");
        return ret;
    }
}