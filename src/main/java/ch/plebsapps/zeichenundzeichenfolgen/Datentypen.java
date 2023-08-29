package ch.plebsapps.zeichenundzeichenfolgen;

public class Datentypen {
    public static void main(String[] args) {

        //charAddDatentyp();
        //charForDatentyp();
        //charFunction();
        //wrapperExample();
        //immutableDatentyp();
        stringBuilder();
    }

    private static void stringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hallo");
        sb.append(" Welt");

        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }

    private static void immutableDatentyp() {
        //Ein immutabler (auch unveränderlicher) Datentyp ist ein Datentyp,
        //dessen Werte nach ihrer Erstellung nicht geändert werden können.
        //Jede "Änderung" an einem immutablen Objekt führt in der Regel zur
        //Erstellung eines neuen Objekts.

        String originalString = "Hello";
        String modifiedString = originalString.concat(" World"); // Neuer String wird erzeugt

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);

        //In diesem Beispiel wird der ursprüngliche String "Hello"
        //nicht verändert. Stattdessen wird ein neuer
        //String "Hello World" erzeugt, indem die concat-Methode aufgerufen wird.
    }

    private static void wrapperExample() {
        // Verwendung von primitiven Datentypen
        int primitiveInt = 42;
        char primitiveChar = 'A';

        // Verwendung von Wrapper-Klassen
        Integer wrappedInt = Integer.valueOf(primitiveInt);
        Character wrappedChar = Character.valueOf(primitiveChar);

        // Zugriff auf zusätzliche Methoden der Wrapper-Klassen
        int intValue = wrappedInt.intValue(); // Konvertierung in int
        char charValue = wrappedChar.charValue(); // Konvertierung in char

        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Character: " + wrappedChar);
        System.out.println("Unwrapped int value: " + intValue);
        System.out.println("Unwrapped char value: " + charValue);
        /*
        In diesem Beispiel wird ein int und ein char als primitive Datentypen deklariert.
        Dann werden Wrapper-Klassen (Integer und Character) verwendet,
        um diese primitiven Werte in Objekte umzuwandeln.
        Dadurch können wir auf zusätzliche Methoden zugreifen,
        die von den Wrapper-Klassen bereitgestellt werden,
        wie z.B. intValue() und charValue(),
        um die Werte aus den Wrapper-Objekten zurückzugewinnen.
        */
    }

    private static void charFunction() {

        System.out.println(Character.isAlphabetic('a'));
        System.out.println(Character.isAlphabetic('1'));

        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('t'));
        System.out.println(Character.isWhitespace('\t'));

        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isLetter('\t'));
        System.out.println(Character.isLetter('5'));

        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('\t'));
        System.out.println(Character.isDigit('0'));
    }

    private static void charForDatentyp() {

        for (int ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
        }

        System.out.println();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
        }
    }

    // Addition mit Char
    private static void charAddDatentyp() {
        char c = 'A';

        System.out.println(c + 1);
        System.out.println((char) (c + 1));
        System.out.println((char) c + 1);

        char a = 65 + 1;

        System.out.println(a);
    }
}