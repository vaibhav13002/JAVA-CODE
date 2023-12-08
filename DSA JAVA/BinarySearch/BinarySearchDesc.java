package BinarySearch;
public class BinarySearchDesc {
    public static void main(String[] args) {
        
        int[] arr={87,85,74,54,2,1,-3};
        int target=74;
        int ans=binarysearch(arr, target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start <= end){
            int mid=start+ (end-start)/2;

            if(target<arr[mid]){
                start=mid+1;
            }
            else if(target>arr[mid]){
                end=end-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
