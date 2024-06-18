package Blind75;

import java.util.ArrayList;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            arr.add(s.charAt(i));
        }
        System.out.println(arr);
        for (int j = 0; j < t.length(); j++) {
            if (arr.contains(t.charAt(j))) {
                arr.remove(j);
                System.out.println(arr);
            } else {
                return false;
            }
        }
        return true;

    }
}
