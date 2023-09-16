package ch.plebsapps.lambda;

import java.util.function.Predicate;

public class JavaFunctional {

    public static void main(String[] args) {

        Predicate<String> empty = isEmpty(true);
        Predicate<String> empty2 = isEmpty(false);

    }

    //TODO Nachmal schauen 97


    //mit (Strg + Alt + v) eine Abkürzung für das Extrahieren von Variablen
    //Das ist die Kurzschreibweise
    static Predicate<String> isEmpty(boolean shouldTrim ) {
        return (String s) -> shouldTrim ? s.trim().isEmpty() :s.isEmpty();
    }
    /* Das wäre die Schreibweise länger
    static Predicate<String> isEmpty() {
        Predicate<String> stringPredicate = (String s) -> s.isEmpty();
        return stringPredicate;
    }*/


    static long execute(Runnable runnable) {
        runnable.run();
        return 0;
    }
}
