package LeetGFG;
//https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/description/
import java.util.Arrays;
// 2no condition ek se he check ho jarhe h 
// just need to check arr[n+2] jo ki o jo 3 ka subarray ban rha h uska last element agr satisfy kr rha h tho 
// 2nd condition of lesst than or equal to k wala to already satisfy h since arr is sorted, ab beech me ya small value hoga ya equal nd both will be fine

public class ArraysofArraysMaxDiff2966 {
    public static void main(String[] args) {
        int[] inputArray = {1,3,4,8,7,9,3,5,1};
        int k = 2;

        int[][] result = divideArray(inputArray, k);

        // Print the result
        for (int[] subarray : result) {
            System.out.println(Arrays.toString(subarray));
        }
    }
        public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] result = new int[0][0];
        
        for (int i = 0; i + 2 < nums.length; ++i) {
            if (i % 3 == 0) {
                if (nums[i + 2] - nums[i] <= k) {
                    int[] triplet = {nums[i], nums[i + 1], nums[i + 2]};
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = triplet;
                } else {
                    return new int[0][0];
                }
            }
        }
        
        return result;
    }
}


// class Solution {
//     public int[][] divideArray(int[] nums, int k) {
//         if(nums.length % 3 != 0){
//             return new int[][]{};
//         }
//         Arrays.sort(nums);
//         int[][] ans = new int[nums.length/3][3];   // int[row][col]; // yahi pr he nums 3-3 bluck me divide ho jarha h
//         int index=0;
//         for(int i=0; i<nums.length-2; i=i+3){  // i=i+3  har ek sub array ke liye chalega
//             if(nums[i+2] - nums[i] > k){
//                 return new int[][]{};
//             }else {
//                 for (int j = 0; j < 3; j++) {
//                     ans[index / 3][j] = nums[index];
//                     index++;
//                 }
//             }
//         }
//         return ans;
//     }
// }