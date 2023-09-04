package ch.plebsapps.zeichenundzeichenfolgen;

import java.util.Arrays;
import java.util.Locale;

public class KlasseString {

    public static void main(String[] args) {
        //ueberpruefung();
        //zeichenzugriff();
        //zeichenIndex();
        zeichenIndexVonRechts();
        //vergleichVonStrings();
        //stringVerbinden();
        //stringUpperCase();
        //stringReplace();
        //stringWiederholen();
        //stringZerschneiden();
        //stringMatches();
        //stringSubString();
        //stringStartEndWith();

    }

    private static void stringStartEndWith() {
        System.out.println("Hallo Welt".startsWith("Hall"));
        System.out.println("Hallo Welt".startsWith("Welt"));
        System.out.println("Hallo Welt".endsWith("Welt"));

    }

    private static void stringSubString() {
        System.out.println("Hallo Welt Radio".substring(6,10));
    }

    private static void stringMatches() {
        System.out.println("gg".matches("\\d+"));
        System.out.println("235".matches("\\d+"));
        System.out.println("235 ".matches("\\d+"));
    }

    private static void stringZerschneiden() {
        System.out.println(Arrays.toString("abd8jsg4jhh3nni".split("\\d")));
        System.out.println(Arrays.toString("192.168.178.1".split("[.]")));
    }

    private static void stringWiederholen() {
        String repeat = "ab";

        System.out.println(repeat.repeat(4));
    }

    private static void stringReplace() {
        String replace = "HolliGolli";

        System.out.println(replace.replace("o", "a"));
        //System.out.println(replace.replaceAll("o", "a"));
        //System.out.println(replace.replaceFirst("o", "a"));

    }

    private static void stringUpperCase() {
        String camel = "ApfeL";

        System.out.println(camel.toUpperCase());
        System.out.println(camel.toLowerCase());

        System.out.println("ß".toLowerCase());
        System.out.println("ß".toUpperCase());

        System.out.println("123".toLowerCase());
        System.out.println("123".toUpperCase());

        System.out.println("?!".toUpperCase());
        System.out.println("?!".toLowerCase());

        System.out.println("ßü".toLowerCase(Locale.GERMAN));

    }

    private static void stringVerbinden() {
        System.out.println("Hallo" + 1 + true + 2);
        System.out.println("Hallo".concat(" Welt"));
        System.out.println(String.join(".", "192", "168", "178", "1"));
    }

    private static void vergleichVonStrings() {

        System.out.println("abc".compareTo("xyz"));
        System.out.println("xyz".compareTo("abc"));
        System.out.println("abc".compareTo("bcd"));
        System.out.println("bbc".compareTo("acd"));
        System.out.println("abc".compareTo("ABC"));
        System.out.println("abc".compareToIgnoreCase("ABC"));

    }

    private static void zeichenIndexVonRechts() {
        String text = "Hallo Welt, alles ist schöne";
        char suchChar = 'e';
        int  a = text.length()+1;

        do {
            a = text.lastIndexOf(suchChar,a-1);
            System.out.println(a);
        } while(a != -1);
    }

    private static void zeichenIndex() {
        String text = "Hallo Welt, alles ist schöne";
        char suchChar = 'e';
        int  a = 0;

        do {
            a = text.indexOf(suchChar,a+1);
            System.out.println(a);
        } while(a != -1);
    }

    private static void zeichenzugriff() {
        String name = "Fritz";

        System.out.println(name.charAt(1));
        System.out.println(name.charAt(name.length() - 1));

        System.out.println(isAllDigits("234"));
        System.out.println(isAllDigits("23as4"));
        System.out.println(isAllDigits(""));

        System.out.println(name.indexOf("i"));
        System.out.println(name.indexOf("x"));
        System.out.println(name.indexOf("Z"));
    }

    private static boolean isAllDigits(String s) {
        if(s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    private static void ueberpruefung() {
        String name = "Heinz";

        System.out.println(name.length());        // länge nicht wie bei Array ein Attribut sondern eine Methode
        System.out.println(!name.isEmpty());      // Ist nicht leer

        System.out.println(name.isBlank());
        System.out.println("     ".isBlank());    // true wenn der String aus leerzeichen besteht.
        System.out.println("     ".isEmpty());    // false weil nicht leer
    }


}
