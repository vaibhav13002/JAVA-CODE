package ArrayList;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={ {11,43,25,67,43},
                      {23,45,22,77},
                      {3,-7,12,-0,-3}

        };
        int target=3;
        int[] answ=search(arr, target);
        // System.out.println(answ);  //pata nhi kyu garbage value print kr rha hai
        System.out.println(Arrays.toString(answ));
    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
        // return -1;
    }
}
