package HashSet;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;


public class SortingHashmap {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        // implementation of HashMap
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        // addding keys and values to HashMap
        hm.put(23, "Yash");
        hm.put(17, "Arun");
        hm.put(15, "Swarit");
        hm.put(9, "Neelesh");

        Iterator<Integer> it = hm.keySet().iterator();
        System.out.println("Before Sorting");
        while (it.hasNext()) {
            int key = (int) it.next();
            System.out.println("Roll no:  " + key + "     name:   " + hm.get(key));
        }
        System.out.println("\n");

        @SuppressWarnings("unused")  //warning ko suppress krta h

        Map<Integer, String> map = new HashMap<Integer, String>();
        System.out.println("After Sorting");
        // using TreeMap constructor to sort the HashMap
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>(hm); // This constructor copies all the mappings from the given Map (in this case, hm) to the TreeMap.
        Iterator itr = tm.keySet().iterator();
        while (itr.hasNext()) {
            int key = (int) itr.next();
            System.out.println("Roll no:  " + key + "     name:   " + hm.get(key));
        }
    }
}

// iterator(): This method returns an iterator over the elements in the set of keys. An iterator allows you to iterate over the elements of a collection sequentially, one by one.

// TreeMap is used in Java when you need a map implementation that maintains the keys in sorted order.