package ch.plebsapps.kontrollstrukturen;

public class ForCase {

    public static void main(String[] args) {

        //Allgemein
        // for(Deklarieren und Initialisieren ; Bedingung ; Modifikation )

        //Wird der mittlere Teil der For-Schleife weggelassen ist er implizit true das würde bedeuten, das es eine Endlos schleife, wäre.
        /*
        for (int i = 0;  ; i++) {
            .... Anweisungen ...
        }
        */


        //Eine For-Schleife ist vergleichbar mit der While schleife das heist es ist auch eine abweisende schleife die 0 mal durchlaufen.
        for (int i = 1; i <= 0 ; i++) {
            System.out.println("drin");
        }

        // Man kann auch mehrere Variablen Deklarieren im ersten teil diese müssen aber vom gleichen Typ sein.
        // Auch im Modifikation Bereich kann man mehrere dinge, tun.
        for (int x = 0, y = 1; x < 10; x++, y--) {
            System.out.println(x + " " + y);
        }




    }
}
