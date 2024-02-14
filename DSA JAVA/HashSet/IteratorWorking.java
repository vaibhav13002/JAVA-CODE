package HashSet;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorWorking {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Obtaining an iterator for the collection
        Iterator<String> iterator = fruits.iterator();

        // Iterating over the elements using the iterator
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
        System.out.println("Loop Ends....");
    }
}
