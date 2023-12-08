package BinarySearch;
public class CheckSortedRotatedArrayBST {
    public static void main(String[] args) {
        //ulta kaam kr rha h check kr lena 
        int[] nums={5,1,2,3,4};
        System.out.println(Check(nums));
    }
     static boolean Check(int[] nums){
       int left = 0, right = nums.length - 1;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] > nums[right]) {
            left = mid + 1;
        } else if (nums[mid] < nums[right]) {
            right = mid;
        } else {
            right--;
        }
    }
    return left == right && isNonDecreasing(nums);
}
 static boolean isNonDecreasing(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] > nums[i+1]) {
            return false;
        }
    }
    return true;
}
}
