package Pattern_Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
       int[] arr={1,4,2,5,3};
       bubble(arr, arr.length-1, 0); //ulta likha h and chal ulta rha h
       System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]> arr[c+1]){
                int temp=arr[c+1];
                arr[c+1]=arr[c];
                arr[c]=temp;
            }
            bubble(arr,r, c+1);
        }
        else{
            bubble(arr,r-1, 0); //col 0 se vapis start
        }
    }
}
