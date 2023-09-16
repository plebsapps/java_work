package ch.plebsapps.lambda;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ShorteningLambdaExpressions {
    public static void main(String[] args) {

        moeglichkeitenVonLamda();
        typInferenz();
        entwederAusdruckOderBlock();
        ohneKlammern();
        beispielListeVereinfachung();
    }

    private static void beispielListeVereinfachung() {

        List<String> names = new ArrayList<>();
        names.removeIf((String s) -> {return s.isEmpty();});
        names.removeIf(( s ) -> {return s.isEmpty();});
        names.removeIf(( s ) ->  s.isEmpty());
        names.removeIf(s -> s.isEmpty());

        names.forEach( (s) -> System.out.println(LocalTime.now()));
        names.forEach( (__) -> System.out.println(LocalTime.now())); // __ ist die abkürzung für nichts weil in den oberen Beispiel wir s nicht verwendet daher __
    }

    private static void ohneKlammern() {
        //Einzelner Identifizierer statt Parameterliste und Klammern
        Predicate<String> isEmpty = s-> s.isEmpty();                        // wen genau 1 Parameter
        Comparator<String> trimmedComparator = (s1,  s2) -> s1.trim().compareTo(s2.trim());
        Consumer<String> consumer =  s -> System.out.println(s);            // wen genau 1 Parameter
    }

    private static void entwederAusdruckOderBlock() {
        //Der Lamda Ausdruck ist entweder ein einzelner Ausdruck oder ein Block
        // {return Ausdruck;} =>  -> Ausdruck
        Predicate<String> isEmpty = (s)-> s.isEmpty();
        Comparator<String> trimmedComparator = ( s1,  s2) -> s1.trim().compareTo(s2.trim());
        Consumer<String> consumer = ( s) -> System.out.println(s);           //Sonderfall void-kompatibel
    }

    private static void typInferenz() {
        //Typ-Inferenz (Impliziter Typ)
        Predicate<String> isEmpty = (s)-> {return s.isEmpty();};
        Comparator<String> trimmedComparator = ( s1,  s2) ->{return s1.trim().compareTo(s2.trim());};
        Consumer<String> consumer = ( s) -> {System.out.println(s);};
    }

    private static void moeglichkeitenVonLamda() {
        Predicate<String> isEmpty = (String s)-> {return s.isEmpty();};
        Comparator<String> trimmedComparator = (String s1, String s2) ->{return s1.trim().compareTo(s2.trim());};
        Consumer<String> consumer = (String s) -> {System.out.println(s);};
    }
}