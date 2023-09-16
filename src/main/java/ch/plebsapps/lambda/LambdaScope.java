package ch.plebsapps.lambda;

import java.util.function.Predicate;

public class LambdaScope {

    public static void main(String[] args) {

        //lambdaMitZweiSchreibweisen();
        //lambadPredicateTest();
        lambdaWithTenaer();

    }

    private static void lambadPredicateTest() {
        Predicate<String> isEmpty1 = String::isEmpty;
        Predicate<String> isEmpty2 = s -> s.isEmpty();

        System.out.println(isEmpty1.test("")); // true
        System.out.println(isEmpty1.test("Hello")); // false

        System.out.println(isEmpty2.test("")); // true
        System.out.println(isEmpty2.test("Hello")); // false
    }

    private static void lambdaMitZweiSchreibweisen() {
        Predicate<String> isEmpty1 = String::isEmpty;    //is it the same
        Predicate<String> isEmpty2 = s -> s.isEmpty();   //is it the same
    }

    private static void lambdaWithTenaer() {
        // Aber Achtung shouldTrim ist "final" beziehungsweise "effectively final"
        boolean shouldTrim = true;
        Predicate<String> isEmpty = s -> shouldTrim ? s.trim().isEmpty() : s.isEmpty();

        System.out.println((isEmpty.test(" kkksh")));

        //shouldTrim = false;   //Geht nicht
        System.out.println((isEmpty.test(" kkksh")));
    }
}