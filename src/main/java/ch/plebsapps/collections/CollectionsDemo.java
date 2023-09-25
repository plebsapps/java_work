package ch.plebsapps.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CollectionsDemo {
    public static void main( String[] args ) {
        Person person = new Person();
        person.addCat( new Cat() );
        person.addCat( new Cat() );
        person.addCat( new Cat() );
        List<Cat> cats = person.getCats();
        cats.clear();
    }
}

class Person {
    private List<Cat> cats;

    public List<Cat> getCats() {
        if ( cats == null )
            return Collections.emptyList();
        //Collections.unmodifiableList gibt eine Liste zurück die nicht modifiziert werden kann.
        //Ansonsten wäre es ja möglich die liste zu modifizieren von Aussen und das konnte ja nicht gewollt sein.
        return Collections.unmodifiableList( cats );
    }

    // "Lazy Initialization Pattern",
    // um das cats-Feld zu initialisieren, wenn es benötigt wird. Das Lazy Initialization Pattern verzögert
    // die Erstellung oder Initialisierung eines Objekts bis zum Zeitpunkt,
    // an dem es tatsächlich benötigt wird, um Ressourcen zu sparen oder die Leistung zu optimieren.
    public void addCat( Cat cat ) {
        if ( cats == null )
            cats = new ArrayList<>();
        cats.add( cat );
    }
}

class Cat {
    private String key;
    private String value;

    Map<String, String> getProperties() {
        return Collections.singletonMap( key, value );
    }
}