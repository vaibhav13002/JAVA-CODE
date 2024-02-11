package Contest;

import java.util.Arrays;

public class ModifytheMatrix {
    public static void main(String[] args) {
        
    }
        public static int[][] modifiedMatrix(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int[] maxInColumn = new int[cols];
        Arrays.fill(maxInColumn, Integer.MIN_VALUE);

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                if (arr[i][j] > maxInColumn[j]) {
                    maxInColumn[j] = arr[i][j];
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = maxInColumn[j];
                }
            }
        }
        return arr;
    }
}
