package BinarySearch;

public class DecendingBinary {
    public static void main(String[] args) {
        int arr[] = {77,66,55,44,33,22,11,00};
        int target= 55;
        int ans= DecBin(arr, target);
        System.out.println(ans);
    }
    public static int DecBin(int[] arr, int target){
        int start=0;
        int end= arr.length-1;

        while(start <= end){  // this is index not the value
            int mid = start + (end-start)/2;
            if(target< arr[mid]){
                start=mid +1;
            }
            else if(target > arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
