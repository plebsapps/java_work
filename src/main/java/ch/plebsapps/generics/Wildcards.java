package ch.plebsapps.generics;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {

    }
    //Das wäre die Wildcard schreibweise von sum2
    static double sum(List<? extends Number> numbers) {
        double sum = 0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    //TODO versuchen zu verstehen?
    public static <T> T min (Collection<? extends T> coll, Comparator<? super T> comp){
      return null;
    }

    //TODO versuchen zu verstehen?
    public static <T> boolean addAll(Collection<? super T> coll, T... elements){
        return true;
    }

    //PECS-Prinzip
    //PECS = Producer extends / consumer super
    // - extends wird verwendet wenn gelesen wird
    // - super wird verwendet wenn geschrieben wird


    static <T extends Number> double sum2(List<T> numbers) {
        double sum = 0;

        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
}