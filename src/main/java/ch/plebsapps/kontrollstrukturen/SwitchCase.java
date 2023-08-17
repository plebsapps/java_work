package ch.plebsapps.kontrollstrukturen;

public class SwitchCase {
    public static void main(String[] args) {
        int test = (int)(Math.random() * 6); // Zahlen von 0 bis 5 ;-)

        switch (test){
            // Aufzählung erst ab Java 14 im zweiten switch mehr dazu...
            case 1 , 2:
                System.out.println("Test = 1 oder 2");
                break;
            case 3:
                System.out.println("Test = 3");
                break;
            default:
                System.out.println("Etwas anderes = " + test);
                break;
        }

        switch (test) {
            // ab Java 14 (veröffentlicht im März 2020) darf man aufzählungen machen und die Lambdas benutzen.
            // die sogenannte "Switch Expressions"
            case 1, 2 -> System.out.println("Test = 1 oder 2");
            case 3 -> {
                System.out.println("Test = 3");
                System.out.println("Mehrere anweisungen in {}");
            }
            default -> System.out.println("Etwas anderes = " + test);
        }

        //Man kann ab Java 14 auch ein Switch-Case als  Ausdruck schreiben der z.B ein ergebnis zurück gibt
        String s = "+";
        String ergebnis = switch (s) {
            case "+" -> "Plus";
            case "-" -> "Minus";
            case "*", "x" -> "Mal";
            case "/" -> "Geteilt";
            default -> "Unbekannter ausdruck";
        };
        System.out.println(ergebnis);


        //Auch noch eine neuheit ist das yield schlüsselwort was man in einen block schreiben kann der die ausgabe angibt.
        //yield heist so gut wie führt zu.
        ergebnis = switch (s) {
            case "+" -> "Plus";
            case "-" -> {
                System.out.println("Ohhh ein Minus");
                yield "Minus";
            }
            case "*", "x" -> "Mal";
            case "/" -> "Geteilt";
            default -> "Unbekannter ausdruck";
        };
        System.out.println(ergebnis);



    }
}
