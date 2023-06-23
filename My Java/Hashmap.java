import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<String , Integer> students=new HashMap<>(); 
        students.put("vaibhav", 65);
        students.put("ankit", 74);
        students.put("raj", 95);
        students.put("abin", 25);
        System.out.println(students);
        
        
        for( String n : students.keySet() ){
            System.out.println(n+":"+students.get(n));
        }
    }
}
