package ch.plebsapps.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaIntroPredicate {

    public static void main(String[] args) {

        //mitAnonymerKlasse();
        //mitEinfachenLambdaAusdruck();
        mitEinfachenLambda();

        //TODO Implementierung der Lambda ausdrücke Video 92 Time 14:00

    }

    private static void mitEinfachenLambda() {
        List<String> names = new ArrayList<>();
        names.add("Jaoa");
        names.add("");
        names.add("Noah");
        System.out.println(names);

        names.removeIf((String s) -> s.isEmpty());
        System.out.println(names);
    }

    private static void mitEinfachenLambdaAusdruck() {
        //Ein einfacher Lambda
        Predicate<String> isEmpty = (String s) -> s.isEmpty();

        List<String> names = new ArrayList<>();
        names.add("Jaoa");
        names.add("");
        names.add("Noah");
        System.out.println(names);

        names.removeIf(isEmpty);
        System.out.println(names);
    }

    private static void mitAnonymerKlasse() {

        Predicate<String> isEmpty = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isEmpty();
            }
        };

        List<String> names = new ArrayList<>();
        names.add("Jaoa");
        names.add("");
        names.add("Noah");
        System.out.println(names);

        names.removeIf(isEmpty);
        System.out.println(names);
    }
}