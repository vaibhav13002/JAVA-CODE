package Pattern_Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,5,4,2,3};
        selection(arr, 5, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
//max ko last me bhej rhe h
    static void selection(int[] arr, int r, int c, int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[max]<arr[c]){
                selection(arr, r, c+1, c);
            }else{
                selection(arr, r, c+1, max);
            }
            selection(arr,r, c+1,c);
        }
        else{
                int temp=arr[max];
                arr[max]=arr[r-1];
                arr[r-1]=temp;
            selection(arr,r-1, 0,0); //col 0 se vapis start
        }
    }
}
