package ch.plebsapps.kontrollstrukturen;

public class SwitchCase {
    public static void main(String[] args) {
        easySwitch();
        lambdaSwitch();
        switchString();
        swichStringYield();
        switchWithYield();
   }

    private static void swichStringYield() {
        String s = "+";
        //Auch noch eine neuheit ist das yield schlüsselwort was man in einen block schreiben kann der die ausgabe angibt.
        //yield heist so gut wie führt zu.
        String ergebnis = switch (s) {
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

    private static void switchString() {
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


    }

    private static void lambdaSwitch() {
        int test = (int)(Math.random() * 6); // Zahlen von 0 bis 5 ;-)
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
    }

    private static void easySwitch() {
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
    }

    private static void switchWithYield() {
        String state ="UP";
        int number = switch (state) {
            case "UP":
                yield 5;
            case "DOWN":
                yield 7;
            default:
                System.out.println("Illegal state");
                yield -1;
        };

        System.out.println(number);
    }
}
