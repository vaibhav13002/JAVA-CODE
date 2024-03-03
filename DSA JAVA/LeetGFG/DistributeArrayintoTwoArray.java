package LeetGFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistributeArrayintoTwoArray {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 3, 3 };
        int[] result = resultArray(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] resultArray(int[] nums) {
        // List<Integer> first = new ArrayList<>();
        // List<Integer> second = new ArrayList<>();

        // first.add(nums[0]);
        // second.add(nums[1]);

        // for (int i = 2; i < nums.length; i++) {
        // if (first.get(first.size() - 1) > second.get(second.size() - 1)) {
        // first.add(nums[i]);
        // } else {
        // second.add(nums[i]);
        // }
        // }

        // int[] ans = new int[first.size() + second.size()];
        // int index = 0;

        // for (int num : first) {
        // ans[index++] = num;
        // }

        // for (int num : second) {
        // ans[index++] = num;
        // }

        // return ans;
        ///// for duplicate elements int the array
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {
            int countArr1 = greaterCount(arr1, nums[i]);
            int countArr2 = greaterCount(arr2, nums[i]);

            if (countArr1 > countArr2) {
                arr1.add(nums[i]);
            } else if (countArr1 < countArr2) {
                arr2.add(nums[i]);
            } else {
                // If counts are equal and lengths are equal, append to arr1
                if (arr1.size() == arr2.size()) {
                    arr1.add(nums[i]);
                } else {
                    // If lengths are different, append to the array with fewer elements
                    if (arr1.size() <= arr2.size()) {
                        arr1.add(nums[i]);
                    } else {
                        arr2.add(nums[i]);
                    }
                }
            }
        }

        // Convert Lists to arrays
        int[] result = new int[arr1.size() + arr2.size()];
        int index = 0;

        for (int num : arr1) {
            result[index++] = num;
        }

        for (int num : arr2) {
            result[index++] = num;
        }

        return result;
    }

    public static int greaterCount(List<Integer> arr, int val) {
        int count = 0;
        for (int num : arr) {
            if (num > val) {
                count++;
            }
        }
        return count;
        //TLE
    }
}
