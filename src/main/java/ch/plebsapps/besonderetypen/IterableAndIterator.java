package ch.plebsapps.besonderetypen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableAndIterator {

    public static void main(String[] args) {
        //arryListIterabel();
        //arryListIterator();
        eigeneKlasseErweitertMitIterable();
    }

    private static void eigeneKlasseErweitertMitIterable() {

        Tosters toasters = new Tosters();
        toasters.add(new Toaster());
        toasters.add(new Toaster());
        for (Toaster toaster : toasters) {
            System.out.println(toaster);
            // Ausgabe klasse ist leer daher nur die Referenz z.B:
            // ch.plebsapps.besonderetypen.Toaster@4617c264
            // ch.plebsapps.besonderetypen.Toaster@36baf30c
        }
    }

    private static void arryListIterator() {

        List<String> places = new ArrayList<>();
        places.add("HongKong");
        places.add("NewYork");
        places.add("Kleinseelheim");

        Iterator it = places.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    private static void arryListIterabel() {
        //places ist iterable weil von Typ ArrayList
        List<String> places = new ArrayList<>();
        places.add("HongKong");
        places.add("NewYork");
        places.add("Kleinseelheim");
        for (String place : places) {
            System.out.println(place);
        }

    }
}

class Toaster{

}

class Tosters implements Iterable<Toaster>{
    private  List<Toaster> toasters = new ArrayList<>();

    void add(Toaster toaster){
        toasters.add(toaster);
    }

    @Override
    public Iterator<Toaster> iterator() {
        return toasters.iterator();
    }
}
