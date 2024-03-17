package LeetGFG;

import java.util.Arrays;

public class SortChar {
    public static void main(String[] args) {
        String s = "aabcdabbcf";

        // converting into char array
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);

        //Converting char array bcak to string
        String st= new String(arr);  // basically string is array of char 
        System.out.println(st);
    }
}
