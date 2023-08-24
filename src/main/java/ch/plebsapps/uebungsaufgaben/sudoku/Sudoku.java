package ch.plebsapps.uebungsaufgaben.sudoku;

import java.util.Arrays;

/**
 * Sudoku-Erstellen:
 * <p>
 * 1 2 3  -  4 5 6  -  7 8 9
 * 4 5 6  -  7 8 9  -  1 2 3
 * 7 8 9  -  1 2 3  -  4 5 6
 * <p>
 * 2 x x  -  x x x  -  x x x
 * 3 x x  -  x x x  -  x x x
 * 5 x x  -  x x x  -  x x x
 * <p>
 * 6 x x  -  x x x  -  x x x
 * 8 x x  -  x x x  -  x x x
 * 9 x x  -  x x x  -  x x x
 */
public class Sudoku {
    private static int[][] soduku = new int[9][9];

    public static void main(String[] args) {
        setNewSudoku();
        showSudoku();
    }

    private static void showSudoku() {
        for (int i = 0; i < 9; i++) {
            System.out.println(Arrays.toString(soduku[i]));
        }
    }

    private static void setNewSudoku() {
        int zeile = 0;
        int spalte = 0;
        int feld;

        while (zeile < 9) {
            while (spalte < 9) {
                feld = (int) (Math.random() * 9) + 1;
                //Ist diese Zeile überhaupt möglich, ansonsten lösche die Zeile
                if (isImpossible(zeile, spalte)) {
                    Arrays.fill(soduku[zeile], 0);
                    spalte = 0;
                }
                //Test neues Feld ob es ins Soduko passt
                if (testNeuesFeld(feld, zeile, spalte)) {
                    soduku[zeile][spalte] = feld;
                    spalte++;
                }
            }
            spalte = 0;
            zeile++;
        }
    }

    private static boolean isImpossible(int zeile, int spalte) {
        int[] possible = new int[9];
        Arrays.fill(possible, 0);

        for (int spa = 0; spa < spalte; spa++) {
            possible[(soduku[zeile][spa])-1] = 1;
        }

        for (int zei = 0; zei < zeile; zei++) {
            possible[(soduku[zei][spalte])-1] = 1;
        }

        return !foundPossible(possible);
    }

    private static boolean foundPossible(int[] possible) {
        for (int i : possible) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean testNeuesFeld(int feld, int zeile, int spalte) {
        for (int spa = 0; spa < spalte; spa++) {
            if (feld == soduku[zeile][spa]) {
                return false;
            }
        }

        for (int zei = 0; zei < zeile; zei++) {
            if (feld == soduku[zei][spalte]) {
                return false;
            }
        }
        return true;
    }
}