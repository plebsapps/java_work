package ch.plebsapps.collections;

import java.util.*;

/**
 * Das Set-Interface in Java ist Teil des Java Collections Framework und repräsentiert eine Sammlung,
 * die -- keine doppelten Elemente -- enthält.
 * *
 * Es gibt mehrere Implementierungen dieses Interfaces,
 * wobei HashSet und TreeSet zwei der bekanntesten sind.
 * *
 *HashSet:
 * Interne Datenstruktur:
 *   HashSet basiert auf einer Hash-Tabelle. Genauer gesagt verwendet es intern eine Instanz von HashMap zur Datenhaltung.
 * Reihenfolge der Elemente:
 *   Die Elemente in einem HashSet haben keine garantierte Reihenfolge. Die Reihenfolge kann sich im Laufe der Zeit sogar ändern.
 * Performance:
 *   Das Einfügen, Löschen und Abfragen von Elementen in einem HashSet geschieht in konstanter Zeit O(1) im Durchschnitt, vorausgesetzt die Hash-Funktion verteilt die Elemente gleichmäßig über die Buckets.
 * Null-Element:
 *   HashSet erlaubt das Einfügen eines Null-Elements.
 * *
 *TreeSet:
 * Interne Datenstruktur:
 *   TreeSet basiert auf einer balancierten binären Suchbaumstruktur (genauer gesagt einem Rot-Schwarz-Baum). Intern verwendet es eine NavigableMap, und in der Tat basiert es auf einer TreeMap.
 * Reihenfolge der Elemente:
 *   Die Elemente in einem TreeSet sind natürlich geordnet (entweder durch ihren natürlichen Ordnung, oder durch einen bereitgestellten Comparator beim Erstellen des TreeSet).
 * Performance:
 *   Das Einfügen, Löschen und Abfragen von Elementen in einem TreeSet geschieht in logarithmischer Zeit O(log n), da dies die Performance-Charakteristika eines balancierten Suchbaums sind.
 * Null-Element:
 *   Ein TreeSet erlaubt das Einfügen eines Null-Elements nur, wenn ihm ein expliziter Comparator bereitgestellt wird, der mit Null-Werten umgehen kann.
 *   Bei natürlich geordneten Sets wird ein Null-Element nicht akzeptiert und wirft eine NullPointerException.
 * *
 * Wählen Sie ** HashSet **, wenn Sie hauptsächlich - schnellen Zugriff - benötigen und die Reihenfolge der Elemente nicht wichtig ist.
 * Wählen Sie ** TreeSet **, wenn Sie die Elemente in einer - sortierten Reihenfolge - benötigen oder wenn Sie
 *    Funktionen wie lower(), higher(), first(), last() usw. nutzen möchten, die die TreeSet-Klasse aufgrund ihrer baumbasierten Natur bietet.
 * *
 *LinkedHashSet:
 * Reihenfolge der Elemente:
 *  Bleibt so wie die Elemente hinzugefügt worden sind
 *
 */
public class JavaUtilSet {
    public static void main(String[] args) {
        // hashSetDemo();
        // treeSetDemo();
        // treeSetMitComparatorDemo();
        // treeSetMitStringComparatorDemo();
        // navigableSet();
        linkedHashSet();

    }

    private static void linkedHashSet() {
        // LinkedHashSet
        Collection<Integer> numbers = Arrays.asList( 9, 7, 6, 3, 2, 2, 9, 4, 1 );
        System.out.println( new LinkedHashSet<>( numbers ) );
    }

    private static void treeSetMitStringComparatorDemo() {
        //Beispiel mit einem Comparator den die KLasse String schon selber anbietet -> String.CASE_INSENSITIVE_ORDER.
        //String.CASE_INSENSITIVE_ORDER vergleicht unabhängig von groß und Kleinschreibung
        TreeSet<String> strings = new TreeSet<>( String.CASE_INSENSITIVE_ORDER );
        strings.addAll( Arrays.asList( "abc", "ABC", "DEF", "def" ) );
        System.out.println( strings ); // [abc, DEF]

        //TODO TreeSet
    }

    private static void navigableSet() {
        NavigableSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add( 3243 );
        sortedSet.add( 25 );
        sortedSet.add( 100 );
        sortedSet.add( 324 );
        //Ceiling() - Rückgabewert ist das kleinste Element in diesem Set,
        // das größer oder gleich dem gegebenen Element ist,
        // oder null, wenn es ein solches Element nicht gibt."
        System.out.println( sortedSet.ceiling( 300 ) );  // 323
    }

    private static void treeSetMitComparatorDemo() {
        //Damit es das Location Objekt sortiert ist(es hat ja keine natürliche Ordnung)
        // muss der new LocationComparator() mitgegeben werden.
        Set<Location> sortedSet = new TreeSet<>(new LocationComparator());
        //Ohne Comparator gäb es eine -> java.lang.ClassCastException: class ch.plebsapps.collections.Location cannot be cast to class java.lang.Comparable

        sortedSet.add(new Location(2,2));
        sortedSet.add(new Location(1,3));
        sortedSet.add(new Location(3,2));
        sortedSet.add(new Location(1,2));
        //[Location{x=1, y=2}, Location{x=1, y=3}, Location{x=2, y=2}, Location{x=3, y=2}]
        System.out.println(sortedSet);
    }

    private static void treeSetDemo() {
        // TreeSet
        Set<Integer> sortedSet = new TreeSet<>();
        sortedSet.add( 3243 );
        sortedSet.add( 343 );
        sortedSet.add( 1 );
        sortedSet.add( 324 );

        System.out.println(sortedSet);
    }

    private static void hashSetDemo() {
        //TODO HashSet
        Set<Location> set = new HashSet<>();
        set.add(new Location(1,2));
        set.add(new Location(1,3));
        set.add(new Location(2,2));
        set.add(new Location(1,2));
        //Wenn die Methoden Equals und hashCode nicht überschrieben wäre das Ergebniss
        // [Location{x=1, y=3}, Location{x=2, y=2}, Location{x=1, y=2}, Location{x=1, y=2}]
        // das set.add könnte nicht erkennen das die new Location(1,2) schon vorhanden ist.
        System.out.println(set);

        //Auch contains könnte nicht richtig arbeiten, wenn die Methoden Equals und hashCode nicht überschrieben wären
        System.out.println(set.contains(new Location(1,2)));
        System.out.println(set.contains(new Location(1,222)));
    }
}


class Location {
    int x;
    int y;

    public Location( int x, int y ) {
        this.x = x;
        this.y = y;
    }

    //Standardmäßig überprüft die Methode - equals-  der Object-Klasse,
    //  ob zwei Referenzen auf dasselbe Objekt im Speicher zeigen (Referenzgleichheit).
    //  Für viele Klassen, wie Location, wollen wir jedoch überprüfen,
    //  ob die Daten bzw. Attribute von zwei Objekten gleich sind,
    //  nicht ob sie dieselbe Speicheradresse haben (semantische Gleichheit).
    //  Daher muss - equals - überschrieben werden.
    //  UND siehe - hashCode -
    @Override
    public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;

        Location location = (Location) o;

        if ( x != location.x )
            return false;
        return y == location.y;
    }

    //Wenn Sie die Methode - equals - überschreiben,
    //  sollten Sie immer auch - hashCode - überschreiben, um sicherzustellen,
    //  dass zwei gleichwertige Objekte denselben Hashcode haben.
    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "Location{" + "x=" + x + ", y=" + y + '}';
    }
}

/**
 * Hier die Klasse LocationComparator
 *
 * Ein Comparator ist eine Schnittstelle, die speziell dazu dient,
 * zwei Objekte zu vergleichen.
 * Wenn Sie beispielsweise Location-Objekte anhand ihrer
 * x- und y-Koordinaten sortieren möchten, könnten Sie einen Comparator wie folgt erstellen:
 */
class LocationComparator implements Comparator<Location> {

    //In dieser Implementierung werden Location-Objekte zuerst
    // nach ihrer x-Koordinate sortiert.
    // Nur wenn die x-Koordinaten von zwei Objekten gleich sind,
    // wird die y-Koordinate zur Sortierung herangezogen.
    @Override
    public int compare(Location loc1, Location loc2) {
        // Zuerst nach 'x' sortieren
        int xComparison = Integer.compare(loc1.x, loc2.x);
        if (xComparison != 0) {
            return xComparison;
        }

        // Wenn 'x' gleich ist, dann nach 'y' sortieren
        return Integer.compare(loc1.y, loc2.y);
    }
}