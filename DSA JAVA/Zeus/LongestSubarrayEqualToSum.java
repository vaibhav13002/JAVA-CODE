package Zeus;

import java.util.HashMap;

public class LongestSubarrayEqualToSum {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 7, 3, 2, 2, 1 };
        int x = 15;
        // int result = maxLengthConsecutiveSum(arr, x);
        int result = BruteForceN2(arr, x);
        System.out.println(result);
    }

    public static int maxLengthConsecutiveSum(int[] arr, int x) {
        int maxLength = 0;
        int currentSum = 0;
        HashMap<Integer, Integer> sumIndices = new HashMap<>();
        sumIndices.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (sumIndices.containsKey(currentSum - x)) {
                maxLength = Math.max(maxLength, i - sumIndices.get(currentSum - x));
            }

            if (!sumIndices.containsKey(currentSum)) {
                sumIndices.put(currentSum, i);
            }
        }
        return maxLength;
    }

    public static int BruteForceN3(int[] nums, int target) {
        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j <  n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {  // jo subarray form kr rha h usko iterate krke sum
                    sum += nums[k];
                }
                if (sum == target) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }  
    public static int BruteForceN2(int[] nums, int target) {
        int n = nums.length;
        int maxLen = 0;
        
        for (int i = 0; i < n; i++) {
            int sum=0;  // yahi pr initialize krna h taki for each new iteration of i o reset ho jaye 0 se
            for (int j = i; j <  n; j++) {
                sum += nums[j];
                if (sum == target) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }    
}
