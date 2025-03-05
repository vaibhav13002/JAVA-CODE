package SliddingWindow;

import java.util.Arrays;

public class PermutationString567 {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo" ;
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 > len2)
            return false;

        int[] s1Freq = new int[26]; // Frequency array for s1
        int[] windowFreq = new int[26]; // Frequency array for current window

        // Fill frequency array for s1
        for (char c : s1.toCharArray()) {
            s1Freq[c - 'a']++;
        }

        // Sliding Window
        for (int i = 0; i < len2; i++) {
            // Add new character to window
            windowFreq[s2.charAt(i) - 'a']++;

            // Remove leftmost character when window size exceeds s1 length
            if (i >= len1) {
                windowFreq[s2.charAt(i - len1) - 'a']--;
            }

            // Check if window matches s1 frequency
            if (Arrays.equals(s1Freq, windowFreq)) {
                return true;
            }
        }
        return false;
    }
}
