package ch.plebsapps.javaselib;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;


public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        //operationenBigInteger();
        //binarInfo();
        kaufmanischRunden();
    }

    private static void kaufmanischRunden() {

        // Erstelle einen BigDecimal-Wert
        BigDecimal bd = new BigDecimal("123.45478");

        // Runde den Wert auf 2 Dezimalstellen mit der kaufmännischen Rundung
        BigDecimal rounded = bd.setScale(2, RoundingMode.HALF_EVEN);

        // Ausgabe
        System.out.println("Originaler Wert: " + bd);
        System.out.println("Gerundeter Wert: " + rounded);
    }

    private static void binarInfo() {
        BigInteger big = new BigInteger("1000100101000100101001001010",2);
        //Als Decimal
        System.out.println(big);
        //Als Binary
        System.out.println(big.toString(2));
    }

    private static void operationenBigInteger() {
        //+ , - , * , / add, min , multiply, divide
        BigInteger big1 = new BigInteger("10000");
        BigInteger big2 = new BigInteger("10000");

        System.out.println(big1.add(big2));
    }
}
