package BinarySearch;
import java.util.Arrays;

public class BSTin2DArray {
    public static void main(String[] args) {
        int[][] arr={
              {10,20,30,40},
              {15,25,35,45},
              {28,29,37,49},
              {33,34,38,50},
        };
        System.out.println(Arrays.toString(Search(arr, 37)));
    }
    static int [] Search(int[][] matrix,int target){
        int row=0;
        // int col=matrix.length-1;
        int col = matrix[0].length-1;  // this would also work
        // System.out.println(matrix.length);

        while (row<matrix.length && col>=0) {
            if (matrix[row][col]==target) {
                return new int[]{row,col};
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
