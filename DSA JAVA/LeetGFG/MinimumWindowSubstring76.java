package LeetGFG;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring76 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        String result = findSubarray(s, t);

        if (result.isEmpty()) {
            System.out.println("No valid subarray found for the characters in string t.");
        } else {
            System.out.println("Subarray: " + result);
        }
    }
    public static String findSubarray(String s, String t) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        Map<Character, Integer> subarrayFrequency = new HashMap<>();

        // Initialize character frequency map for string t
        for (char c : t.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int requiredChars = charFrequency.size();
        int formedChars = 0;
        int minLen = Integer.MAX_VALUE;
        String result = "";

        while (right < s.length()) {
            // Expand the window
            char currentChar = s.charAt(right);
            subarrayFrequency.put(currentChar, subarrayFrequency.getOrDefault(currentChar, 0) + 1);

            // Check if the character is one of the required characters
            if (charFrequency.containsKey(currentChar) && subarrayFrequency.get(currentChar).equals(charFrequency.get(currentChar))) {
                formedChars++;  // a check karega ki saarey element t ke haina subarray me
            }

            // Try to minimize the window  // a atab jab jo subarray humne dhunda h chahe o bada he ho usme saarey t ke h char
            while (formedChars == requiredChars && left <= right) {  // left and right for window size
                // Update result if the current subarray is smaller
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    result = s.substring(left, right + 1);
                }

                // Contract the window
                char leftChar = s.charAt(left);
                subarrayFrequency.put(leftChar, subarrayFrequency.get(leftChar) - 1);

                // Check if the character is one of the required characters
                if (charFrequency.containsKey(leftChar) && subarrayFrequency.get(leftChar) < charFrequency.get(leftChar)) {
                    formedChars--;
                }
                left++;  // window ko chota krne me  jab tk o char na miljaye jo req h
            }
            // Expand the window
            right++;  // responsible to expand subarray window that contains all our required char
        }
        return result;
    }


    // public static String findSubarray(String s, String t) {
    //     HashMap<Character, Integer> map = new HashMap<>();
        
    //     for (char c : t.toCharArray()) {
    //       map.put(c, map.getOrDefault(c, 0) + 1);
    //     }
        
    //     int start = 0, end = 0, counter = map.size(), maxlen = 0, subStart = 0;
        
    //     while (end < s.length()) {
    //       char c = s.charAt(end);
    //       if (map.containsKey(c)) {
    //         map.put(c, map.get(c) - 1);
    //         if (map.get(c) == 0)
    //           counter--;
    //       }
          
    //       end++;
          
    //       while (counter == 0) {
    //         char tempc = s.charAt(start);
    //         if (map.containsKey(tempc)) {
    //           map.put(tempc, map.get(tempc) + 1);
    //           if (map.get(tempc) > 0)
    //             counter++;
    //         }
            
    //         if (end - start > maxlen) {
    //           maxlen = end - start;
    //           subStart = start;
    //         }
            
    //         start++; 
    //       }
    //     }
        
    //     return maxlen == 0 ? "" : s.substring(subStart, subStart + maxlen);
    //   }
}
