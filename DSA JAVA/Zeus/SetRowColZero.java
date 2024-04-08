package Zeus;

import java.util.Arrays;

public class SetRowColZero {
private static boolean[] rowHasZero;
private static boolean[] colHasZero;
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1}
        };

        setZeroes(matrix);
        System.out.println(Arrays.toString(rowHasZero));
        System.out.println(Arrays.toString(colHasZero));
        // Print the modified matrix
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix) {
        rowHasZero = new boolean[matrix.length];
        colHasZero = new boolean[matrix[0].length];

        // Mark rows and columns containing 0s
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowHasZero[i] = true;
                    colHasZero[j] = true;
                }
            }
        }

        // Set rows to 0
        for (int i = 0; i < matrix.length; i++) {
            if (rowHasZero[i]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set columns to 0
        for (int j = 0; j < matrix[0].length; j++) {
            if (colHasZero[j]) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
