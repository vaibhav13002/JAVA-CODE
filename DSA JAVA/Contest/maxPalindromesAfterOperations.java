package Contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class maxPalindromesAfterOperations {
    public static void main(String[] args) {
        String[] words = {"abbb","ba","aa"};
        System.out.println(maxPalindromes(words));
    }
        public static int maxPalindromes(String[] words) {
        
        Map<Character, Integer> charFreq = new HashMap<>();
        List<Integer> halfPairs = new ArrayList<>();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
            }
            halfPairs.add(word.length() / 2);
        }
        
        int totalHalfPairs = 0;
        for (int freq : charFreq.values()) {
            totalHalfPairs += freq / 2;
        }
        Collections.sort(halfPairs);
        int wordIndex = 0;
        for (int halfPair : halfPairs) {
            if ((totalHalfPairs -= halfPair) < 0) {
                return wordIndex;
            } else {
                wordIndex++;
            }
        }
        return halfPairs.size();
    }
}
