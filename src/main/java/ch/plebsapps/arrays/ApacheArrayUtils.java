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

       arrayAddAll();
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