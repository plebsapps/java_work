package ch.plebsapps.generics;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GenericsTypesMethods {
    public static void main(String[] args) {
        //arrayListOhneTyp();
        classePair2();

    }

    private static void classePair2() {
        Pair2<String, Integer> object1 = new Pair2<>("String", 3);
        Pair2<Integer, String> object2 = new Pair2<>(3, "String");

        //Die Typ information verschwindet
        System.out.println(object1.getClass() == object2.getClass());

        //Geht so nicht
        //System.out.println(object2 instanceof Pair2<String, Integer>);

        System.out.println(object1 instanceof Pair2);
        System.out.println(object2 instanceof Pair2);

    }

    private static void arrayListOhneTyp() {
        ArrayList list = new ArrayList();
        list.add(new Point());
        list.add("");
        list.add(2);

        //Allerding weis man nicht was herauskommt daher
        Object o = list.get(0);
    }

    //Eine normale Methode mit den Typ String
    static String firstOrElse(List<String> list, String defaultValue){
        if (list == null || list.isEmpty()){
            return defaultValue;
        }

        return list.get(0);
    }

    //Eine Generic Methode mit Variablen Typ T
    static <T> T firstOrElse(List<T> list, T defaultValue){
        if (list == null || list.isEmpty()){
            return defaultValue;
        }
        return list.get(0);
    }


    static class Pair {
        public final Object first;
        public final Object second;

        Pair(Object first, Object second) {
            this.first = first;
            this.second = second;
        }
    }

    static class Pair2<T,U> {
        public final T first;
        public final U second;

        Pair2(T first, U second) {
            this.first = first;
            this.second = second;
        }
    }
}