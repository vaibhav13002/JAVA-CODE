package Blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum2(nums, target)));
        
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }

    public static int[] twoSum1(int[] nums, int target) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else { // sum == target
                ans[0] = start;
                ans[1] = end;
                return ans; // Break out of the loop and return the result
            }
        }
        // If no solution is found, returning an array indicating no valid indices.
        return new int[]{-1, -1};
    }
//one pass hashmap
    public static int[] twoSum2(int[] nums, int target){ // tmie and space = O(N)
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){  //if (numMap.containsKey(complement) && numMap.get(complement) != i)  the 2nd one is used to check the 2 numbers which we have selected there indices are not same /// it is mentioned in the qstn
                return new int[]{map.get(complement),i};
            }else{
                map.put(nums[i], i);
            }
        }

        return new int[]{-1,-1};
    }
//Two pass hashMap
        public static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{}; // No solution found
    }
}





//  return new int[]{-1, -1};