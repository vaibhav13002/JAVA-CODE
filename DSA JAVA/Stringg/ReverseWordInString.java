package Stringg;


public class ReverseWordInString {
    public static void main(String[] args) {
        String k="     the sky is        blue";
        System.out.println(Rev(k));
        String comma = "Name,My   ,is,Vaibhav";
        System.out.println(Comma(comma));
    }
    public static String Rev(String k){
        // Trim the input string to remove leading and trailing spaces
        String[] str = k.trim().split("\\s+"); // space ke hisab se word ko array me store kr rha h

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i >= 0; i--) {
            // Append the current word and a space to the output
            out += str[i] + " ";
        }

        // Append the first word to the output (without trailing space)
        return out;
    }
    public static String Comma(String s){
        String[] str = s.split(",");

        String ans = "";
        for(int i = str.length-1; i>0 ;i--){
            ans += str[i]+" ";
        }
        return ans + str[0];
    }
}


// agr , se toodne h and extra space bhi hatana h tho simple pehle , se tod lo and usey while string in the array .trim() se extra space bhi hata do , baad me for each se uss array ko traverse krdena