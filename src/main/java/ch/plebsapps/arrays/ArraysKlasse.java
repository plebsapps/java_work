package ch.plebsapps.arrays;

import java.util.Arrays;

public class ArraysKlasse {
    public static void main(String[] args) {

        //char2DimArray();
        //char2DimArray2();
        //triangle();
        //drehen90();
        //cloneTest();
        //copyArray();
        //arrayToString();
        //arrayCompare();
        //arrayBinarySearch();
        //arraysCopy();
        //arraysFill();
        //arraysMismatch();
        //arrayEquals();
        binarySearchTest();
    }

    private static void binarySearchTest() {
        int[] ints = {-9, 14, 37, 102};
        System.out.println(A.exists(ints, 102)); // true
        System.out.println(A.exists(ints, 36)); // false
    }

    class A {
        static boolean exists(int[] ints, int t) {
            Arrays.sort(ints);
            System.out.println(Arrays.binarySearch(ints, t));
            return true;
        }
    }

    public static void arrayEquals(){
        int[] numbers1 = {12, 34, 56};
        int[] numbers2 = {12, 34, 56};

        System.out.println(Arrays.equals(numbers1, numbers2));
    }

    public static void arraysMismatch(){
        String[] names1 = {"Peter", "Paul", "Geige", "Peter", "Xaviar"};
        String[] names2 = {"Peter", "Paul", "Georg", "Peter", "Xaviar"};
        System.out.println(Arrays.mismatch(names1, names2));


        String[] names3 = {"Peter", "Paul", "Georg", "Peter", "Xaviar"};
        String[] names4 = {"Peter", "Paul", "Georg", "Peter", "Xaviar"};
        System.out.println(Arrays.mismatch(names3, names4));
    }

    public static void arraysFill(){
        String[] name = new String[8];
        Arrays.fill(name, "Hallo");
        System.out.println(Arrays.toString(name));


        Arrays.fill(name, 1,5,"NOOOO");
        System.out.println(Arrays.toString(name));
    }

    public static void arraysCopy(){
        // copyof
        String[] names1 = {"Peter", "Paul", "Georg", "Peter", "Xaviar"};
        String[] names2 = Arrays.copyOf(names1, 2);

        System.out.println(Arrays.toString(names2));

        //copyOfRange
        String[] names3 = Arrays.copyOfRange(names1, 1,3);
        System.out.println(Arrays.toString(names3));
    }

    public static void arrayCompare(){
        String[] names = {"A"};
        String[] names2 = {"1"};

        System.out.println("Compare: " + Arrays.compare(names, names2));

        String[] names3 = {"Peter", "Paul", "Georg", "Peter", "Xaviar"};
        String[] names4 = {"Peter", "Paul", "Georg", "Peter", "Xaviar"};

        System.out.println("Compare: " + Arrays.compare(names3, names4));

        /*
        "Lexicographically" bezieht sich auf die Reihenfolge von Wörtern oder Zeichen,
        basierend auf ihrer Position im Alphabet.
        Wenn zwei Wörter oder Zeichenketten lexicographically verglichen werden,
        wird zuerst das erste Zeichen jedes Wortes miteinander verglichen.
        Wenn sie gleich sind, wird das zweite Zeichen verglichen, und so weiter.
        */

        byte[] werte1 = {-128};
        byte[] werte2 = {127};

        System.out.println("Compare:" + Arrays.compareUnsigned(werte1, werte2));
    }

    public static void arraySort(){
        String[] names = {"Peter", "Paul", "Georg", "Peter", "Xaviar"};

        Arrays.sort(names);
    }

    public static void arrayBinarySearch(){
        String[] names = {"Damula", "Balli", "Chor", "Andru", "Xaviar", "Aala"};

        System.out.println("Search:" + Arrays.binarySearch(names, "Andru"));
        /* Die Ausgabe -1 tritt auf, weil Sie die Methode Arrays.binarySearch auf
        einem nicht sortierten Array verwenden.
        Die Methode binarySearch erfordert, dass das Array zuerst sortiert ist,
        damit sie korrekt funktioniert. Andernfalls kann das Ergebnis unvorhersehbar sein.  */


        Arrays.sort(names);
        System.out.println("Search:" + Arrays.binarySearch(names,"Georg"));
        System.out.println(Arrays.toString(names));
        /* Die Ausgabe -5 tritt auf, weil die Methode Arrays.binarySearch das Element
        "Georg" im sortierten Array names nicht gefunden hat und stattdessen
        den Index zurückgibt, an dem das Element eingefügt werden müsste,
        um die Sortierreihenfolge beizubehalten.

        Sprich an stelle 4 im Index müsste "Georg" eingefügt werden. -> (-5 +1) * -1
        Index = (Ergebnis + 1) * -1   */

        Arrays.sort(names);
        System.out.println("Search:" + Arrays.binarySearch(names,"Balli"));
        System.out.println(Arrays.toString(names));
        // Die Ausgabe ist 2, weil das Element an Index stelle 2 zu finden ist.

        Arrays.sort(names);
        System.out.println("Search:" + Arrays.binarySearch(names, 0, 2,"Andru"));
        System.out.println(Arrays.toString(names));
        // Die Ausgabe ist 1, weil das Element an Index stelle 1 zu finden ist.
    }

    public static void arrayToString(){
        String[] names = {"Peter", "Paul", "Georg", "Peter", "Xaviar"};

        System.out.println(Arrays.toString(names));
    }

    public static void copyArray(){
        String[] names = {"Peter", "Paul"};
        String[] names2 = new String[2];

        System.arraycopy(names,0,names2,0,2);
        names2[1] = "Stefan";
        System.out.println(names2[1]);
        System.out.println(names[1]);
    }

    public static void cloneTest(){
        int[] numbers = {1,2,3,4,5,6};
        int[] numbers2 = numbers.clone();
        numbers[2] =4;
        System.out.println(numbers2[2]);
        System.out.println(numbers[2]);

        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] matrix2 = matrix.clone();
        matrix[1][1]= 1;
        System.out.println(matrix2[1][1]);
    }

    public static void drehen90(){
        int[][] bild = new int[4][5];

        bild[0] = new int[]{1,2,3,4,5};
        bild[1] = new int[]{1,2,3,4,5};
        bild[2] = new int[]{1,2,3,4,5};
        bild[3] = new int[]{1,2,3,4,5};

        int[][] bild2 = new int[bild[0].length][bild.length];

        for (int i = 0; i < bild.length; i++) {
            for (int j = 0; j < bild[i].length ; j++) {
                bild2[j][i] = bild[i][j];
            }
        }

        for (int[] ints : bild) {
            for (int zahl : ints) {
                System.out.printf("%2d", zahl);
            }
            System.out.println("");
        }

        for (int[] ints : bild2) {
            for (int zahl : ints) {
                System.out.printf("%2d", zahl);
            }
            System.out.println("");
        }
    }

    public static void triangle(){
        int [][] triangle = new int[5][];

        triangle[0] = new int[]{1};
        triangle[1] = new int[]{1,2};
        triangle[2] = new int[]{1,2,3};
        triangle[3] = new int[]{1,2,3,4};
        triangle[4] = new int[]{1,2,3,4};

        for (int[] ints : triangle) {
            for (int zahl : ints) {
                System.out.printf("%2d",zahl);
            }
            System.out.println();
        }
    }

    public static void char2DimArray(){
        char[][] zeichen= {{},{},{}};

        System.out.println(zeichen[2].length);
        System.out.println(zeichen.length);
    }

    public static void char2DimArray2(){
        char[][] zeichen= {{},{},{}};

        System.out.println(zeichen[2].length);
        System.out.println(zeichen.length);
    }
}