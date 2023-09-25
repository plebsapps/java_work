package ch.plebsapps.collections;

import java.util.*;

/**
 *     Unterschied List und Collections
 *     - List bzw. listen haben eine Stelle (Index)
 *     - List hat mehr methoden
 *     - "Collections" ist ein allgemeiner Begriff, der sich auf das gesamte Java Collection Framework bezieht,
 *        während "List" ein spezifisches Interface innerhalb dieses Frameworks ist.
 */
public class JavaUtilList {
    public static void main(String[] args) {
        //methodenOfAllArtOfList();
        //methodenOfAllArtOfLinkedList();
        arraysToList();
    }

    private static void arraysToList() {
        //Arrays zu einer Liste machen mit einen Adapter

        //Das Adapter-Muster (auch bekannt als "Adapter") ist ein Design-Pattern
        // in der Softwareentwicklung, das dazu verwendet wird, zwei inkompatible
        // Schnittstellen miteinander kompatibel zu machen. Es dient als Brücke
        // zwischen den beiden Schnittstellen, sodass sie zusammenarbeiten können.
        // In Java kann das Adapter-Muster beispielsweise durch die Implementierung
        // eines Interfaces und die Delegation an eine Instanz einer anderen Klasse
        // umgesetzt werden. Es ermöglicht Systemen,
        // die ansonsten aufgrund unterschiedlicher Schnittstellen nicht
        // zusammenarbeiten könnten, miteinander zu interagieren.


        String[] names = {"Peter","Andru","Steven"};
        List<String> stringList = Arrays.asList(names);
        //Das Array names zu Liste aber  *** ACHTUNG ****
        // Es wird eine ArrayListe die UNVERAENDERLICH ist erstellt.

        //Das *.add würde eine - Exception in thread "main" java.lang.UnsupportedOperationException nach sich ziehen !!!!
        //stringList.add("klaus");        //FEHLER
    }

    private static void methodenOfAllArtOfLinkedList() {
    // LinkedList
    /*
            +-------+       +-------+       +-------+
    +------>|       +------>|       +------>|       |
            |   A   |       |   B   |       |   C   |
    <-------+       |<------+       |<------+       |
            +-------+       +-------+       +-------+
     */
        //Bei einer LinkedList sind Einfüge- und Löschoperationen in der Regel effizient,
        // insbesondere wenn die Position des Einfügens oder Löschens bekannt ist.
        // Das Durchlaufen der Liste kann jedoch aufwendiger sein,
        // insbesondere im Vergleich zu Datenstrukturen wie ArrayList,
        // da es notwendig ist, von Knoten zu Knoten zu springen,
        // anstatt einen direkten Indexzugriff zu haben.

        // Implementierung der Schnittstelle java.util. public interface Deque<E> extends Queue<E>

        // Erstellen einer neuen LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Elemente zur Liste hinzufügen
        list.add("A");
        list.add("B");
        list.add("C");

        // Ein Element an einer bestimmten Position einfügen
        list.add(1, "D");

        // Ein Element aus der Liste entfernen
        list.remove(2);

        // Ein Element anhand seines Wertes entfernen
        list.remove("C");

        // Durch die Liste gehen und jedes Element ausgeben
        for (String item : list) {
            System.out.println(item);
        }
    }

    private static void methodenOfAllArtOfList() {
        // ArrayList
        /*
                  +---+---+---+---+---+---+---+---
                  | A | B | C | D | E | F | G | ...
                  +---+---+---+---+---+---+---+---
           Index    0   1   2   3   4   5   6
        */

        //Wenn man weis wieviele Elemente eine Liste, ArrayList, Array hat ist es gut dieses gleich anzugeben!
        //Eine Erweiterung ist immer "Teuer" rechen Zeit...
        //List<String> names = new ArrayList<>(100);

        List<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Hans");
        names.add("Stefan");
        names.add("Dieter");
        names.add("Cora");

        System.out.println(names);

        //contains
        System.out.println(names.contains("Kiki"));
        System.out.println(names.contains("Peter"));

        //indexOf
        System.out.println(names.indexOf("Peter"));
        System.out.println(names.indexOf("Kiki"));

        //get
        System.out.println(names.get(1));
        System.out.println(names.get(3));
        //java.lang.IndexOutOfBoundsException - Index 199 out of bounds for length 5
        //System.out.println(names.get(199));#

        //List hat das Iterable<E> Interface
        names.forEach(s -> System.out.println("**" + s + "**"));

        //replaceALL
        names.replaceAll(s -> s.toUpperCase());
        System.out.println(names);

        //Sort
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
    }




}
