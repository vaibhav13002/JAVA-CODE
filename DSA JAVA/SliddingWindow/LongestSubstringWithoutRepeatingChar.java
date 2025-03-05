package SliddingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }
        public static int lengthOfLongestSubstring(String s) {
        int windowStart=0; 
        int windowEnd=0;
        int maxLength = Integer.MIN_VALUE;
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        while(windowEnd < n){
            char c = s.charAt(windowEnd);

            if(set.contains(c)){
                while(windowStart < windowEnd && set.contains(c)){      // dvdf ,, while(windowStart < windowEnd )  agar mera while loop bas a rehta tho o purey lement ko nikal deta upto v (dv) jabki hume bas d ko nikalne h and mere pointer v pr ho taki vdf substring ko le saku mai
                    set.remove(s.charAt(windowStart));
                    windowStart++;

                }
            }else{
                set.add(c);
                maxLength = Math.max(maxLength , windowEnd - windowStart+1);
                windowEnd++;
            }

        }
        if(maxLength == Integer.MIN_VALUE){
            return 0;
        }
        return maxLength;

        //using hasmap instead and set and removing while loop of iterating linearly for removing the element
    }
}
