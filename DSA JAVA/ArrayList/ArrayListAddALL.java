package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class ArrayListAddALL {
    public static void main(String[] args) {
        
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        List<String> list2 = new ArrayList<>();
        list2.add("Orange");
        list2.add("Grape");

        // Use the addAll method to add all elements from list2 to list1
        list1.addAll(list2);

        // Now list1 contains all elements from list2
        System.out.println(list1);
    }
}
