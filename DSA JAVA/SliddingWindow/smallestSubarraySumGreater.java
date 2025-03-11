package SliddingWindow;

import java.util.ArrayList;
import java.util.List;

// Smallest subarray with sum greater than x
// https://www.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1?utm_campaign

public class smallestSubarraySumGreater {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 0, 19 };
        int x = 51;
        System.out.println(Sum(arr, x));
        System.out.println(minSubarrayWithSumGreaterThanX(x, arr));
    }

    public static int Sum(int[] arr, int x) {
        // int n = arr.length;
        int minLength = Integer.MAX_VALUE;
        int start = 0, sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            while (sum > x) {
                minLength = Math.min(minLength, i - start + 1);
                sum -= arr[start];
                start++;
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

// Storing the Subarray also
    public static List<Integer> minSubarrayWithSumGreaterThanX(int x, int[] arr) {
        int n = arr.length;
        int minLength = Integer.MAX_VALUE;
        int start = 0, sum = 0;
        int startIndex = -1, endIndex = -1;

        for (int end = 0; end < n; end++) {
            sum += arr[end]; // Expand the window

            // Shrink the window while sum > x
            while (sum > x) {
                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    startIndex = start;
                    endIndex = end;
                }
                sum -= arr[start]; // Shrink the window
                start++;
            }
        }
        // If no valid subarray found, return empty list
        if (startIndex == -1) {
            return new ArrayList<>();
        }
        // Manually create a List<Integer> from the subarray
        List<Integer> result = new ArrayList<>();
        for (int i = startIndex; i <= endIndex; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}
