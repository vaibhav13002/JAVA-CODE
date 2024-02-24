package LeetGFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        // System.out.println((arr[0][1]));

        // Sorting based on first value
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        // This will print the hashcode of the array not the actual array
        // System.out.println(Arrays.toString(arr));

        // for (int[] subarray : arr) {
        // System.out.print(Arrays.toString(subarray));
        // }

        // Merging overlapping subarrays
        List<int[]> result = new ArrayList<>();
        int[] currentInterval = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (currentInterval[1] >= arr[i][0]) {
                // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentInterval[1], arr[i][1]);
            } else {
                // Non-overlapping intervals, add the merged interval to the result
                result.add(currentInterval);
                currentInterval = arr[i];
            }
        }
        // Add the last merged interval to the result
        result.add(currentInterval);

        // Convert List<int[]> to int[][]
        int[][] mergedArray = new int[result.size()][2];
        // for (int i = 0; i < result.size(); i++) {
        // mergedArray[i] = result.get(i);
        // }

        // Printing the merged result
        for (int[] subarray : result) {
            System.out.print(Arrays.toString(subarray));
        }
    }
}
