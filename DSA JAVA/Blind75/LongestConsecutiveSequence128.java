package Blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence128 {
    public static void main(String[] args) {
        int[] nums={9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive1(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int maxCount = 1;
        int currentCount = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {  // Skip duplicates
                if (nums[i] == nums[i-1] + 1) {
                    currentCount++;
                } else {
                    maxCount = Math.max(maxCount, currentCount); // jaise he streak tuutata h current count ko save krlenegey
                    currentCount = 1;   // reset the counter
                }
            }
        }
        
        return Math.max(maxCount, currentCount);    // koi bhi max ho skta h
    }
        public static int longestConsecutive1(int[] nums) {
        // Create a HashMap to store all numbers
        Map<Integer, Boolean> numMap = new HashMap<>();
        
        // Add all numbers to the map
        for (int num : nums) {
            numMap.put(num, false);
        }
        
        int longestSequence = 0;
        
        // Iterate through each number
        for (int num : nums) {
            // If this number hasn't been visited and doesn't have a left neighbor
            if (!numMap.get(num) && !numMap.containsKey(num - 1)) {
                int currentNum = num;
                int currentSequence = 1;
                
                // Count consecutive numbers to the right
                while (numMap.containsKey(currentNum + 1)) {
                    currentNum++;
                    currentSequence++;
                    numMap.put(currentNum, true);  // Mark as visited
                }
                
                // Update longest sequence if necessary
                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }
        
        return longestSequence;
    }
}
