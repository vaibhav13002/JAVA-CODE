package LeetGFG;

import java.util.Arrays;

public class PlayWithOR {
    public static void main(String[] args) {
        int arr[]={10, 11, 1, 2, 3};
        System.out.println(Arrays.toString(game_with_number(arr, 5)));
    }
    public static int[] game_with_number (int arr[], int n) {
        int[] ans = new int[n];
        for(int i=0; i<n-1; i++){
            ans[i] += arr[i] | arr[i+1];
        }
        ans[n-1] += arr[n-1];
        return ans;
    }
}
