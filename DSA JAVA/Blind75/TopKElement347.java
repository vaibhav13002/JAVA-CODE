package Blind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKElement347 {
    public static void main(String[] args) {

    }

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int freq = map.get(nums[i]);
                freq++;
                map.put(nums[i], freq);
            } else {
                map.put(nums[i], 1);
            }
        }
        int arr[] = new int[k];
        int j = 0;
        for (int i = 0; i < k; i++) { // k iteration me k no of element add hoga array me
            int freq = 0;
            int max = 0;
            for (Map.Entry<Integer, Integer> val : map.entrySet()) {
                if (val.getValue() > freq) {
                    freq = val.getValue();
                    max = val.getKey();
                }
            }
            map.put(max, 0); // after selecting the max hum uske freq ko zero krdengey taki next iteration me
                             // o vapas select na ho
            arr[j] = max;
            j++;
        }
        return arr;
    }
}
