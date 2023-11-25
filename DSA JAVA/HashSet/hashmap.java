package HashSet;

import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);
        map.put("USA", 50);
        map.put("US", 30);
        map.entrySet()

        System.out.println(map);

        System.out.println(map.containsKey("China"));
        System.out.println(map.get("China"));
        System.out.println(map.get("japan"));

        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey());
            System.out.println(" "+e.getValue());
        }
    }
}
