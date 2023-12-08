package BinarySearch;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-4,1,2,13,32,45,56,65,71,78,79,88,95};
        int target=71;
        int ans=binarysearch(arr, target);
        System.out.println(ans);   
    }
    static int binarysearch(int[] arr, int target){
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
                return mid; 
            }
        }
        return -1;
    }
}
