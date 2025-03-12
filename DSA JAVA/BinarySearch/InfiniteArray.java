package BinarySearch;

// In this question we have given an array of which length is not given and we need to consider that array is infinite, need to find target element
public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,10,11,12,14,15,16,7,18,19,21,22,23,24,25,26};
        int target = 21;
        System.out.println(FindAns(nums, target));
    }
    public static int FindAns(int[] nums , int target){
        int start =0;
        int end = nums[1];
        while(target > nums[end]){
            int newStart = end +1;
            end = end + (end -start +1)*2;      // end se window banana start hoga current window size asper 0 based indexing n-k+1
            start =  newStart;
        }
        return binarysearch(nums, target);
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
}
