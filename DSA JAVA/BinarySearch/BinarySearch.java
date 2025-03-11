package BinarySearch;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={71};
        int target=71;
        int ans=binarysearch(arr, target);
        System.out.println(ans);   
    }
    static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start <= end){   // Equal to hona chayeh varna last element traverse nhi hoga agr 1 he element hoga tho while loop ka condition he h nhi form hogaa.
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
    public static int Recursive(int[] nums, int low, int high, int target){
        if(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                return Recursive(nums, low, mid-1, target);
            }
            else{
                return Recursive(nums, mid+1, high, target);
            }
        }
        return -1;
    }
}


//testing