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
        int target = 37;
        System.out.println(Arrays.toString(Search(arr, target)));
        System.out.println(searchMatrix(arr, target));
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
/////// Using Binary Search  ////////   
        public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;     // 3x4

        while (left <= right) {
            int mid = left + (right - left) / 2;    //We are considering the 2D array as 1D flattened array
            int midValue = matrix[mid / cols][mid % cols];    // mid is index number and mid/cols is also return index number
// Since there are cols columns in each row, dividing by cols gives the row number.
// Example: If mid = 5 and cols = 4:
// 5 / 4 = 1 → The element is in row 1.

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
/* {1,2,3,4},
   {5,6,7,8},
   {9,10,11,12},
   {13,14,15,16},
*/ 