package LeetGFG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueIntAfterKRemoval {
    public static void main(String[] args) {
        int[] array = {4,3,1,1,3,3,2};
        int k = 3;
        System.out.println(Count(array, k));
    }
    public static int Count(int[] arr, int k){
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequencies
        for (int element : arr) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        // Sort the HashMap based on frequencies
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        // Decrease frequencies based on k
        for (Map.Entry<Integer, Integer> entry : entryList) {
            int element = entry.getKey();
            int frequency = entry.getValue();

            int decreaseAmount = Math.min(k, frequency);   // ki kitna hum decrement kr sktey h frequency based on k , so that it could not become negative
            frequency -= decreaseAmount;
            k -= decreaseAmount;

            if (frequency == 0) {
                frequencyMap.remove(element);
            } else {
                frequencyMap.put(element, frequency);
            }

            if (k == 0) {
                break; // Stop when k becomes zero
            }
        }
        // Print the size of the updated frequency map
        return frequencyMap.size();   // ab jitne element bachgye sab unique he h
    }
}
