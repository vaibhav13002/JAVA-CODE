package HashSet;

import java.util.HashMap;
import java.util.Map;

public class IterationExample2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();   
        map.put("TCS", "$100 billion");   
        map.put("Wipro", "$21.5 billion");
           
        //iteration over map using forEach() method  
        map.forEach((k,v) -> System.out.println("Company: "+ k + ", Net worth: " + v));   
    }
}
