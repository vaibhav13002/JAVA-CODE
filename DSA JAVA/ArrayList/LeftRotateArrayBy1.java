package ArrayList;

import java.util.Arrays;

public class LeftRotateArrayBy1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        solve(arr, 5);
    }
    static void solve(int arr[], int n) {
        int temp[]=new int[n];
        for (int i = 1; i < n; i++) {
          temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];

        System.out.println(Arrays.toString(temp));
        
      }
}
