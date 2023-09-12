package ch.plebsapps.uebungsaufgaben.pallindrom;

/*
Überprüfung auf Palindrom

Ziel: Implementieren Sie eine Methode, die überprüft, ob eine gegebene Zeichenkette ein Palindrom ist (rückwärts gelesen gleich vorwärts).

Spezifikationen:

Die Methode erhält eine Zeichenkette als Eingabe.
Die Methode sollte true zurückgeben, wenn die Zeichenkette ein Palindrom ist, andernfalls false.
*/
public class CheckPalindrom {
    public static void main(String[] args) {
        //String[] testPal = {"khkzzuzbhb", "Otto", "OTTO", "lijIH", "haniinah", "madam"};

        for (String pal : args) {
            System.out.println(testPalindrom(pal) ? pal + " ist ein Palindrom" : pal + " ist KEIN Palindrom");
        }
    }

    public static boolean testPalindrom(String pal){
        pal = pal.toUpperCase();
        for (int i = 0; i < pal.length()/2; i++) {
            if (pal.charAt(i) != pal.charAt(pal.length()-1-i)){
               return false;
            }
        }
        return true;
    }
}