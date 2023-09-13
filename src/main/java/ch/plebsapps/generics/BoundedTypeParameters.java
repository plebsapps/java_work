package ch.plebsapps.generics;


import java.io.Serializable;

/**
 * Typeinschränkungen (Bounded Type Parameters)
 * - Mehrere Typeinschraänkungen einsetzen
 *
 */

public class BoundedTypeParameters {

    public static void main(String[] args) {

        useRandom();
        useTypeinschränkung();
    }

    private static void useTypeinschränkung() {

    }

    static <T extends CharSequence> T randomBounded(T m, T n){
        return Math.random() > 0.5 ? m : n;
    }

    static <T extends CharSequence & Serializable> T randomMultBounded(T m, T n){
        return Math.random() > 0.5 ? m : n;
    }

    private static void useRandom() {
        System.out.println(random("Hallo","Welt"));
    }

    static <T> T random(T m, T n){
        return Math.random() > 0.5 ? m : n;
    }

}
