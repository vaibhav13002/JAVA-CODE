package BinarySearch;

public class RightRotationCountBS {
    public static void main(String[] args) {
        int[] nums = {15,18,2,3,6,12};
        int[] nums1 = {1,2,3,4,5,6};
        System.out.println(checkRotation(nums));

    }
    public static int checkRotation(int[] nums){
        int pivot = findPeakIndex(nums);

        if(pivot == -1){
            return 0;
        }
        return pivot + 1;
    }
    public static int findPeakIndex(int[] nums){
        int start = 0;
        int end = nums.length-1;

        int mid = start + (end-start)/2;

        if(mid < end && nums[mid] > nums[mid+1]){
            return  mid;
        }
        if( mid > start && nums[mid-1] > nums[mid]){
            return mid-1;
        }
        if(nums[mid] >= nums[start]){
            start = mid+1;
        }else{
            end = mid - 1;
        }
        return -1;
    }
}


///// For ArrayList as input//////
/// 
/// 
// class Solution {
//     public int findKRotation(List<Integer> arr) {
//         int pivot = findPeakIndex(arr);

//         if (pivot == -1) {
//             return 0;
//         }
//         return pivot + 1;
//     }
//         public static int findPeakIndex(List<Integer> nums) {
//         int start = 0;
//         int end = nums.size() - 1;

//         while (start <= end) {  // Corrected missing loop
//             int mid = start + (end - start) / 2;

//             if (mid < end && nums.get(mid) > nums.get(mid + 1)) { 
//                 return mid;
//             }
//             if (mid > start && nums.get(mid - 1) > nums.get(mid)) {  
//                 return mid - 1;
//             }
//             if (nums.get(mid) >= nums.get(start)) { // Changed from `>` to `>=` to handle edge cases
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }
// }