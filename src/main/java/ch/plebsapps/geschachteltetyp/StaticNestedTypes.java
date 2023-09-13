package ch.plebsapps.geschachteltetyp;

import java.util.Objects;
import java.util.function.Predicate;

public class StaticNestedTypes {
    static String PATTERN = "%s%n";

    public static void main(String[] args) {

        //Eine aussere Klasse kann auf seine Innere statische Klasse wie folgt zugreifen
        StaticNestedTypes.NonNull pedicate = new NonNull();
    }

    static class NonNull implements Predicate<Objects> {
        @Override
        public boolean test(Objects objects) {
            // Auch eine Innere statische klasse kann auf Typen der aussernen Klasse zugreifen
            System.out.printf(PATTERN, objects);
            return false;
        }
    }
}
