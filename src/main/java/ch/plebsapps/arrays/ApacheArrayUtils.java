package ch.plebsapps.arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ArraySorter;

import java.util.Arrays;

/**
 * Wichtig ist im File build.gradle folgendes einzutragen:
 * dependencies {
 *     implementation group: 'org.apache.commons', name: 'commons-lang3', version: '3.12.0'
 * }
 */
public class ApacheArrayUtils {

    public static void main(String[] args) {
       // arraysIsSort();
       // arraysSort();
       // arraysIndexOf();
       //arrayAddAll();

       arrayTest();
    }

    private static void arrayTest() {

        // Überlege, ob alle Anweisungen compilieren bzw. zur Laufzeit funktionieren:
        /* 1 */ String[] strings1 = new String[ 100 ];
        /* 2 */ Object[] a1 = (String[]) strings1;
        /* 3 */ Object[] a2 = strings1;
        /* 4 */ Object[] strings2 = new String[]{ "1", "2", "3" };
        /* 5 */ String[] a3 = (String[]) strings2;
        /* 6 */ String[] strings3 = { "1", "2", "3" };
        /* 7 */ Object[] a4 = strings3;
        /* 8 */ Object[] strings4 = { "1", "2", "3" };
        /* 9 */ //String[] a5 = (String[]) strings4;


        /* A */ //int[] ints1 = new int[ 100 ];
        /* B */ //Object[] a6 = (int[]) ints1;
        /* C */ //Object[] ints2 = new int[ 100 ];
        /* D */ //int[] a7 = (int[]) ints2;

    }

    private static void arrayAddAll() {
        String[] name = {"Peter", "Paul", "Marry", "Adam", "Paul"};
        String[] name1 = {"Hein", "Willi", "Udo", "Eva", "Stefan"};

        System.out.println(Arrays.toString( ArrayUtils.addAll(name, name1)));
    }

    private static void arraysIndexOf() {
        String[] name = {"Peter", "Paul", "Marry", "Adam", "Paul"};

        System.out.println(ArrayUtils.indexesOf(name, "Paul"));
    }

    private static void arraysSort() {
        String[] name = {"Peter", "Paul", "Marry", "Adam"};
        ArraySorter.sort(name);

        System.out.println(Arrays.toString(name));
    }

    private static void arraysIsSort() {
        String[] name = {"Peter", "Paul", "Marry", "Adam"};

        System.out.println(ArrayUtils.isSorted(name));
    }



}