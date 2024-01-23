package LeetGFG;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacterString {
    public static void main(String[] args) {
        String inputString = "hello";
        
        if (hasDuplicateCharacters(inputString)) {
            System.out.println("String contains duplicate characters.");
        } else {
            System.out.println("String does not contain duplicate characters.");
        }
    }
    public static boolean hasDuplicateCharacters(String str) {
        Set<Character> charSet = new HashSet<>();
        
        for (char c : str.toCharArray()) {
            if (!charSet.add(c)) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicate characters
}
}



//No, a HashSet in Java does not maintain the order of elements in the order they were added. The elements in a HashSet are stored in an unordered manner. If you need to maintain the order of elements, you can use a LinkedHashSet.