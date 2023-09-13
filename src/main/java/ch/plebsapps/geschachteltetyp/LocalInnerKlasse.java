package ch.plebsapps.geschachteltetyp;

import java.util.Arrays;
import java.util.function.Predicate;

public class LocalInnerKlasse {
    public static void main(String[] args) {

        String[] names = {"AAAA", "AAAA"};
        String[] names2 = {"AaXD", "CCCC"};

        System.out.println("Compare: " + Arrays.compare(names, names2));


        class EmptyPredicate implements Predicate<String>{
            @Override
            public boolean test(String s) {
                return s.isEmpty();
            }
        }
        Predicate<String> emptyPredicate = new EmptyPredicate();

    }

    public class OuterClass {
        private int outerVariable = 10;

        public class InnerClass {
            public void accessOuterVariable() {
              //  System.out.println("Der Wert der äußeren Variable ist: " + outerVariable);
            }
        }
    }

}
