package ch.plebsapps.lambda;

import java.math.BigDecimal;
import java.util.function.IntFunction;

public class ConstructorReferences {

    interface  IntToBigDecimalFunction {
        BigDecimal map (int value);
    }

    public static void main(String[] args) {
        objekterstellen();
        variablenIntToBig();
        intFunktion();
    }

    private static void intFunktion() {
        // Ein int rein ein -> Objekt heraus.
        IntFunction<int[]> function1 = value -> new int[value ];
        IntFunction<int[]> function2 = int[]::new;
    }

    private static void variablenIntToBig() {

        IntToBigDecimalFunction intToBigDecimalFunction1 = value -> BigDecimal.valueOf(value);
        IntToBigDecimalFunction intToBigDecimalFunction2 = value -> new BigDecimal(value);
        //Abkürzung MethodenReference
        IntToBigDecimalFunction intToBigDecimalFunction3 = BigDecimal::valueOf;
        //Abkürzung KonstruktorReference
        IntToBigDecimalFunction intToBigDecimalFunction4 = BigDecimal::new;

    }

    private static void objekterstellen() {
        //Über Konstruktor
        BigDecimal decimalNumber1 = new BigDecimal(123.456);
        //Über statische Methode
        BigDecimal decimalNumber2 = BigDecimal.valueOf(123.456);
    }
}