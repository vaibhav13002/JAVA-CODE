package HashSet;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Set;

public class IteratorWorking {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Mango", 4);
        map.put("Grapes", 7);
    
        // System.out.println(map.containsValue(4));  // it searches value time complexity is O(N)
        // Obtaining an iterator for the collection
        // Iterator<String> iterator = fruits.iterator();

        // Iterating over the elements using the iterator
        // while (iterator.hasNext()) {
        //     String fruit = iterator.next();
        //     System.out.println(fruit);
        // }
        // System.out.println("Loop Ends....");

// Using keySet
            Set<String> keys = map.keySet();
            for( String key : keys){
                System.out.println(key + " " +map.get(key));
            }
            System.out.println(map.keySet());
    }
}
