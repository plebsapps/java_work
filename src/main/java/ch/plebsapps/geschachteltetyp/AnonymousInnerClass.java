package ch.plebsapps.geschachteltetyp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AnonymousInnerClass {

    public static void main(String[] args) {
        //innerKlass();
        //anonymeKlasse();
        anonymeKlasseErweitern();
        System.err.println();
    }

    private static void anonymeKlasseErweitern() {
        //  Instanz einer Anonymen klasse
        BigInteger big2 = new BigInteger("123"){
            @Override
            public String toString() {
                return super.toString() + " €";
            }
        };

        System.out.println(big2);
    }

    private static void anonymeKlasse() {
        // Instanz von BigInteger
        BigInteger big = new BigInteger("123");
        System.out.println(big.getClass());

        //  Instanz einer Anonymen klasse
        BigInteger big2 = new BigInteger("123"){};
        System.out.println(big2.getClass());

        //class java.math.BigInteger
        //class ch.plebsapps.geschachteltetyp.AnonymousInnerClass$1
    }

    private static void innerKlass() {
        //Implemetieren von Schnittstellen, mit new Schnittstellenname() {...}

        //Als eine Innere Klasse
        class EmptyPredicate implements Predicate<String> {
            @Override
            public boolean test(String s) {
                return false;
            }
        }
        Predicate<String> emptyPredicate1 = new EmptyPredicate();


        //Diese Klasse kann man auch als AnonymousInnerKLasse schreiben
        Predicate<String> emptyPredicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };
    }
}