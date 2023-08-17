package ch.plebsapps.kontrollstrukturen;



public class WhileCase {

    public static void main(String[] args) {


        //TODO fertig machen...

        //Fehler da man wissen muss das die Variable "Int Input" nur innerhalb
        //der Schleife sichtbar ist, das könnte eine beliebte Falle sein, die gefragt wird!!!!
        /*
        while (input == 0 ) {
            int imput = new java.util.Scanner(System.in).nextInt();

        }
        */


        // break und continue beispiel
        int i = 0;
        while (true){
            i++;

            if (i < 10) {
                System.out.println("weiter geht´s");
                continue;
            } else {
                break;
            }
        }
    }
}
