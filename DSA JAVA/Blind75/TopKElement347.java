package Blind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TopKElement347 {
    public static void main(String[] args) {

    }

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int freq = map.get(nums[i]);    // if element is present in the hashmap then we will retrieves its current frequency and increment it
                freq++;
                map.put(nums[i], freq);  // then we will update the map with incremented frequency
            } else {
                map.put(nums[i], 1);   // else we will create a key in hasmap with frequency 1
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

// map.KeySet();      // only key....it can be iterating key and accessing the values(map.get())
// map.values();   or map.getValue();
// map.entrySet();


/* 
// To retrieve only keys from the hashmap
HashMap<Integer, Integer> map = new HashMap<>();
// ... (add elements to the map)

Set<Integer> keys = map.keySet();   // we created an keys of type set to access access key from the set
for (Integer key : keys) {
    // Do something with the key
    System.out.println(key);
}
*/

// To retrieve only values
/* 
HashMap<Integer, Integer> map = new HashMap<>();
// ... (add elements to the map)

Collection<Integer> values = map.values();
for (Integer value : values) {
    // Do something with the value
    System.out.println(value);
}
*/


// If you need to iterate over both keys and values simultaneously, you can use the entrySet() method,
/* 
HashMap<Integer, Integer> map = new HashMap<>();
// ... (add elements to the map)

Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
for (Map.Entry<Integer, Integer> entry : entries) {
    Integer key = entry.getKey();
    Integer value = entry.getValue();
    // Do something with the key and value
    System.out.println("Key: " + key + ", Value: " + value);
}     
*/
// Iterating key and accessing value
/* 
HashMap<Integer, Integer> map = new HashMap<>();
// ... (add elements to the map)

for (Integer key : map.keySet()) {
    Integer value = map.get(key);
    // Do something with the key and value
    System.out.println("Key: " + key + ", Value: " + value);
}
*/