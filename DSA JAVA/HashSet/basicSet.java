package HashSet;
import java.util.*;

public class basicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
            set.remove(1);
        set.add(1);
        set.add(3);
        
        
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(set.contains(2));

        Iterator<Integer> it = set.iterator();  //no need to add <Integer>

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
