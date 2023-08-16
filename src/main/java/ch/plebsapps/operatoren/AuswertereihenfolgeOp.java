package ch.plebsapps.operatoren;

/**
 * Die Rangfolge von Operatoren kann für entscheidender Bedeutung
 * sein welches Ergebnis kommt daher diese Liste der Rangfolge der
 * Operatoren wie diese ausgewertet wird.
 * -
 * Zu empfehlen ist hier eigentlich immer es so zu Programmieren,
 * dass dieses auch ohne die Liste ersichtlich ist,
 * zum Beispiel mit Klammern oder entsprechend in der Reihenfolge im Code.
 * -
 * Je weiter oben ein Operator in der Tabelle auftaucht, desto eher wird er ausgewertet.
 * Operatoren mit dem gleichen Rang (in der gleichen Zeile) werden von links nach rechts ausgewertet.
 */
@SuppressWarnings("all")
public class AuswertereihenfolgeOp {


    public static void main(String[] args) {

        System.out.println("1\tPostfix-Operatoren, Postinkrement, Postdekrement\tx++, x--");
        System.out.println("2\tEinstellige (unäre) Operatoren, Vorzeichen\t++x, --x, +x, -x, ~b, !b");
        System.out.println("3\tMultiplikation, Teilerrest\ta*b, a/b, a % b");
        System.out.println("4\tAddition, Subtraktion\ta + b, a - b");
        System.out.println("5\tBitverschiebung\td << k, d >> k, d >>> k");
        System.out.println("6\tVergleiche\ta < b, a > b, a <= b, a >= b, s instanceof S");
        System.out.println("7\tGleich, Ungleich\ta == b, a != b");
        System.out.println("8\tUND (Bits)\tb & c");
        System.out.println("9\tExor (Bits)\tb ^ c");
        System.out.println("10\tODER (Bits)\tb | c");
        System.out.println("11\tLogisch UND\tB && C");
        System.out.println("12\tLogisch ODER\tB || C");
        System.out.println("13\tBedingungsoperator\ta ? b : c");
        System.out.println("14\tZuweisungen\ta = b, a += 3, a -= 3, a *= 3, a /= 3, a %= 3, b &= c, b ^= c, b |= c, d <<=k, d >>= k, d >>>= k");


        boolean a = true, b = false, ergebnis;

        System.out.println("Beispiel:");
        ergebnis = a & b | b;
        System.out.println("a & b | b  - ergebnis: " + ergebnis);

        ergebnis = a | b & b;
        System.out.println("a | b & b  - ergebnis: " + ergebnis);
    }
}
