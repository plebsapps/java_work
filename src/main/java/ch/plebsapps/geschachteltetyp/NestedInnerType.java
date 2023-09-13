package ch.plebsapps.geschachteltetyp;

import java.util.function.Predicate;

public class NestedInnerType {

    public static void main(String[] args) {

        // Besondere Schreibweise um eine Instanz der Inneren Klass zu bekommen
        Predicate<String> endsWithPredicate = new StringPredicate(".txt").new EndsWithPredicate();
    }
}

class StringPredicate {
    final String string;

    public StringPredicate(String string) {
        this.string = string;
    }

    class CotainsPredicate implements Predicate<String> {
        @Override
        public boolean test(String s) {
            return s.contains(string);
        }
    }

    class EndsWithPredicate implements Predicate<String>{
        @Override
        public boolean test(String s) {
            return s.endsWith(string);
        }
    }
}