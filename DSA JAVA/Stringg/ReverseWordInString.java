package Stringg;
public class ReverseWordInString {
    public static void main(String[] args) {
        String k="     the sky is        blue";
        System.out.println(Rev(k));
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
}
