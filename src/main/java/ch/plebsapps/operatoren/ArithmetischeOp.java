package ch.plebsapps.operatoren;

/**
 * Arithmetische Operatoren
 * Eigentlich relativ selbsterklärend, aber der vollständigkeitshalber.
 * Folgend ein Beispiel:
 */
public class ArithmetischeOp {

    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        int ergebnis;

        // + a + b	Addition: Summe von a und b
        ergebnis = a + b;
        System.out.println("+ Ergebnis: " + ergebnis);

        // -	a - b	Subtraktion: Differenz an a und b
        ergebnis = a - b;
        System.out.println("- Ergebnis: " + ergebnis);

        // *	a * b	Multiplikation: Produkt von a und b
        ergebnis = a * b;
        System.out.println("* Ergebnis: " + ergebnis);

        // /	a /  b	Division: Quotient von a und b
        ergebnis = a / b;
        System.out.println("/ Ergebnis: " + ergebnis);

        // %	a % b	Modulo: Rest einer ganzzahligen Division von a durch b
        a = 11;
        ergebnis = a % b;
        System.out.println("% Ergebnis: " + ergebnis);

        // +	positives Vorzeichen, in der Regel überflüssig	int j = +3;
        ergebnis = +a;
        System.out.println("+ Vorzeichen Ergebnis: " + ergebnis);

        // -	negatives Vorzeichen	int minusJ = -j;
        ergebnis = -a;
        System.out.println("- Vorzeichen Ergebnis: " + ergebnis);
    }
}
