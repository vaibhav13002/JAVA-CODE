package SliddingWindow;

import java.util.HashMap;

public class LongestRepeatingCharReplacement424 {
    public static void main(String[] args) {
        String s = "ABAB";
        int k=2;
        System.out.println(characterReplacement(s, k));
    }

    public static int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freqs = new HashMap<>();
        int res = 0;
        int i = 0;
        int maxFreq = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            freqs.put(c, freqs.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, freqs.get(c));

            while ((j - i + 1) - maxFreq > k) {
                char left = s.charAt(i);
                freqs.put(left, freqs.get(left) - 1);
                i++;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
