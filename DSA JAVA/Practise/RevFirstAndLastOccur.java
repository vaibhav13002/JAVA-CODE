package Practise;
//Revision
import java.util.Arrays;

public class RevFirstAndLastOccur {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=8;
        int[] j=finalans(arr, target);
        System.out.println(Arrays.toString(j));

    }
    static int[] ans={-1,-1};

    public static int[] finalans(int[] arr, int target){
        start(arr, target);
        End(arr, target);
        return ans;
    }
    static void start(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start <= end){
            int mid=start+(end-start)/2;

            if(target < arr[mid]){    //yaha value compare horha h coz array is sorted
                end=mid-1;
            }
            else if(target > arr[mid]){
                start=mid +1;
            }
            else{
                ans[0]=mid; 
                end=mid-1;
            }
        }
    }
    static void End(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start <= end){
            int mid=start+(end-start)/2;

            if(target < arr[mid]){    //yaha value compare horha h coz array is sorted
                end=mid-1;
            }
            else if(target > arr[mid]){
                start=mid +1;
            }
            else{
                ans[1]=mid; 
                start=mid+1;
            }
        }
    }
}
