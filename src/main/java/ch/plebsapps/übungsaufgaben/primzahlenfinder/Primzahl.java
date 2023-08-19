package ch.plebsapps.übungsaufgaben.primzahlenfinder;

/**
 * Als Primzahlen bezeichnet man alle natürlichen Zahlen,
 * die nur durch sich selbst und die Zahl Eins teilbar sind.
 * Also zum Beispiel 2, 3, 5, 7, 11, 13, usw.
 * Die 1 ist per Definition keine Primzahl.
 */
public class Primzahl {
    public static void main(String[] args) {

        boolean isPrim;

        for (int prim = 2; prim < 100; prim++) {
            isPrim = true;
            for (int teil = prim - 1; teil > 1; teil--) {
                if (prim % teil == 0) {
                    isPrim = false;
                    break;
                }
            }

            if (isPrim) {
                System.out.println(prim + " <- ist eine Primzahl");
            }
        }
    }
}