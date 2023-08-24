package ch.plebsapps.arrays;

public class ArraySearchExample {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 2},
                {4, 5, 6, 7},
                {7, 8, 9, 7}
        };

        int targetValue = 7;
        int[] position = findValueInMatrix(matrix, targetValue);

        if (position != null) {
            int row = position[0];
            int col = position[1];
            System.out.println("Value " + targetValue + " found at row " + row + " and column " + col);
        } else {
            System.out.println("Value " + targetValue + " not found in the matrix.");
        }
    }

    public static int[] findValueInMatrix(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return null; // Wert nicht gefunden
    }
}




