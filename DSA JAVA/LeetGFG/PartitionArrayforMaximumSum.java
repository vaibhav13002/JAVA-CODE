package LeetGFG;
// https://leetcode.com/problems/partition-array-for-maximum-sum/description/
public class PartitionArrayforMaximumSum {
    public static void main(String[] args) {
        int[] arr = {1, 15, 7, 9, 2, 5, 10};
        int k = 3;
        int result = maxSumAfterPartitioning(arr, k);
        System.out.println(result);
    }
    public static int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int max = 0, sum = 0;
            for (int j = i; j >= Math.max(0, i - k + 1); j--) {
                max = Math.max(max, arr[j]);
                sum = Math.max(sum, max * (i - j + 1) + dp[j]);
            }
            dp[i + 1] = sum;
        }
        return dp[n];
    }
}
