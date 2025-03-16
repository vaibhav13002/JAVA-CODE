package BinarySearch;
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class LeftRotationCount {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(checkLeftRotation(nums));

    }
    public static int checkLeftRotation(int[] nums) {
        int minIndex = findMinIndex(nums); // Find the index of the smallest element
        return nums[minIndex]; // Left rotation count
    }
    public static int findMinIndex(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid + 1; // Minimum element found
            }
            if (mid > start && nums[mid - 1] > nums[mid]) {
                return mid; // Minimum element found
            }

            if (nums[mid] >= nums[start]) {  // pivot/Largest element ke baad ke element start se chotey hotey h
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0; // Array is already sorted (not rotated)
    }
}
