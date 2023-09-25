package ch.plebsapps.collections;

import java.util.*;

/**
 * Iterator - ListIterator
 *
 * In Java stellen sowohl Iterator als auch ListIterator Schnittstellen zur Verfügung,
 * die das Durchlaufen von Sammlungen ermöglichen. Sie haben jedoch unterschiedliche
 * Eigenschaften und Methoden. Hier sind die Hauptunterschiede zwischen Iterator und ListIterator:
 *
 * Richtung des Durchlaufens:
 *  Iterator ermöglicht das Durchlaufen einer Sammlung nur in einer Richtung, von Anfang bis Ende.
 *  ListIterator ermöglicht das Durchlaufen einer Liste in beide Richtungen,
 *  sowohl vorwärts als auch rückwärts, mit den Methoden next() und previous().
 *
 * Modifikationsmethoden:
 *  Während beide Iteratoren die Methode remove() unterstützen,
 *  bietet ListIterator zusätzlich die Methoden add(E e) und set(E e) an.
 *  Mit add(E e) können Sie während des Iterierens ein Element zur Liste
 *  hinzufügen und mit set(E e) können Sie das letzte zurückgegebene Element ersetzen.
 *
 * Indizes:
 *  ListIterator bietet die Methoden nextIndex() und previousIndex() an,
 *  um den Index des nächsten bzw. vorherigen Elements in der Liste zu erhalten.
 *
 * Gültigkeit für Sammlungstypen:
 *  Während Iterator für alle Sammlungstypen im Java Collections Framework verwendet
 *  werden kann (z.B. Set, List, Queue usw.), ist ListIterator speziell für Listen,
 *  d.h. Implementierungen des List-Interfaces (z.B. ArrayList, LinkedList), vorgesehen.
 *
 * Concurrent Modification:
 *  Sowohl Iterator als auch ListIterator werfen eine ConcurrentModificationException,
 *  wenn die zugrundeliegende Sammlung während der Iteration modifiziert wird
 *  (außer durch die eigenen remove(), add() oder set() Methoden des Iterators).
 *  Jedoch ermöglicht ListIterator durch seine add() und set() Methoden mehr
 *  Flexibilität bei der Modifikation während des Iterierens.
 **/
public class JavaUtilIteratorListIterator {

    public static void main(String[] args) {
       // listIteratorDemo();
        listIteratorAndRemoveDemo();
    }

    private static void listIteratorAndRemoveDemo() {
        List<Integer> numbers = new LinkedList<>();
        Collections.addAll( numbers, 1, 34, 5, -1, 34, -22 );
        Iterator<Integer> iterator = numbers.iterator();
        while ( iterator.hasNext() ) {
            Integer number = iterator.next();
            if ( number < 0 ) {
                //löscht alle zahlen die < 0 sind
                iterator.remove();
                //numbers.remove( number );  // Auf der LinkedList etwas löschen würde -> java.util.ConcurrentModificationException
            }
        }
        System.out.println( numbers );
    }

    private static void listIteratorDemo() {
        List<String> names = new LinkedList<>();
        Collections.addAll(names,"Peter" ,"Paul", "Tiki");
        //Hier wird ein ListIterator für die Liste names erstellt und in der Variable listIterator gespeichert.
        //Mit diesem ListIterator kann man anschließend durch die Liste names navigieren und,
        //im Unterschied zu einem herkömmlichen Iterator, auch in beide Richtungen (vorwärts und rückwärts) durch die Liste gehen.
        //
        //Es ermöglicht zudem das Hinzufügen, Entfernen und Ersetzen von Elementen in der Liste während des Iterierens.
        ListIterator<String> listIterator = names.listIterator();

        //Cursor steht vor dem ersten Element
        System.out.println(listIterator.hasPrevious());  //false

        //Zeigt dem next Index an
        System.out.println(listIterator.nextIndex());
        //holt das nächste Element und setz dem Curser 1 stelle weiter
        System.out.println(listIterator.next());

        //holt das nächste Element und setz dem Curser 1 stelle weiter
        System.out.println(listIterator.next());

        //holt das nächste Element und setz dem Curser 1 stelle weiter
        System.out.println(listIterator.next());

        //holt das nächste Element und setz dem Curser 1 stelle weiter
        // System.out.println(listIterator.next());  //würde man zuweit gehen passiert Exception in thread "main" java.util.NoSuchElementException

        //holt das vorige Element und setz dem Curser 1 stelle zurück
        System.out.println(listIterator.previous());

        //holt das vorige Element und setz dem Curser 1 stelle zurück
        System.out.println(listIterator.previous());

        /*
        *   ADD
        */
        listIterator.add( "Pipi" );
        System.out.println( listIterator.previous() );
    }
}
