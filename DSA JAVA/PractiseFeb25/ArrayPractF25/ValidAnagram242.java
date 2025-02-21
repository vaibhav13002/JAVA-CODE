package PractiseFeb25.ArrayPractF25;

import java.util.ArrayList;

public class ValidAnagram242 {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram1(s, t));
        System.out.println(isAnagram2(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // HashSet<Character> set = new HashSet<>();
        ArrayList<Character> set = new ArrayList<>();
        char[] Sarray = s.toCharArray();
        for (char a : Sarray) {
            set.add(a);
        }
        char[] Tarray = t.toCharArray();
        for (char b : Tarray) {
            if (set.contains(b)) {
                set.remove(b);
                // continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        ArrayList<Character> set = new ArrayList<>();
        for (char a : s.toCharArray()) {
            set.add(a);
        }
        
        for (char b : t.toCharArray()) {
            if (!set.isEmpty()) {
                if (set.contains(b)) {
                    set.remove(Character.valueOf(b)); // Ensure correct object removal
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return set.isEmpty(); // Ensure all characters were matched
    }
    public static boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];

        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int a : count){
            if(a != 0){
                return false;
            }
        }
        return true;
    }
}
