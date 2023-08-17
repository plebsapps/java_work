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


    }
}
