package ch.plebsapps.JavaMenu;

public class JavaMenu {

    public static void main(String[] args) {
        //Text eingeben
        String eingebendeTextzeile;
        System.out.println();
        System.out.println("Wie ist dein Name? ");
        // Einlesen einer Tastatureingabe bis zum nächsten Zeilenumbruch in die Variable "eingegebeneTextzeile"
        eingebendeTextzeile = Terminal.readString();
        System.out.printf("Hallo %s%n", eingebendeTextzeile);

        //Menu mit Zahlen
        System.out.println();
        System.out.println("Wählen Sie ihr Geschlecht");
        System.out.println("1) eine Frau ist.");
        System.out.println("2) ein Mann ist.");
        System.out.println("3) eine andere Geschlechterzugehörigkeit hat. (z.B. \"anderes\")");
        int eingegebeneZahl;
        // Einlesen einer Zahl per Tastatureingabe in die Variable "eingegebeneZahl"
        eingegebeneZahl = Terminal.readInt();

        if (eingegebeneZahl == 1) {
            System.out.printf("Hallo Frau %s%n", eingebendeTextzeile);
        } else if (eingegebeneZahl == 2) {
            System.out.printf("Hallo Herr %s%n", eingebendeTextzeile);
        } else {
            System.out.printf("Hallo du neutron %s%n", eingebendeTextzeile);
        }

        switch (eingegebeneZahl) {
            case 1:
                System.out.printf("Hallo Frau %s%n", eingebendeTextzeile);
                break;
            case 2:
                System.out.printf("Hallo Herr %s%n", eingebendeTextzeile);
                break;
            default:
                System.out.printf("Hallo du neutron %s%n", eingebendeTextzeile);
        }
    }
}