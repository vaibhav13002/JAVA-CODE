public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-4,1,2,13,32,45,56,65,71,78,79,88,95};
        int target=71;
        System.out.println(binarysearch(arr, target));   
    }
    static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start <= end){
            int mid=start+(end-start)/2;

            if(target < mid){    //yaha value compare horha h coz array is sorted
                end=arr[mid]-1;
            }
            else if(target > mid){
                start=arr[mid] +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
