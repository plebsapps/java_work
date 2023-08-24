package ch.plebsapps.uebungsaufgaben.primzahltest;

import java.math.BigInteger;

public class PrimeZahlTest {

    public static void main(String[] args) {
        System.out.println(args.length);

        for (String arg : args) {
            BigInteger big = new BigInteger(arg);

            System.out.println(big.isProbablePrime(100));
        }
    }
}
