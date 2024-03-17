package Contest;
// Weekly 389
public class SubstringReverseInString {
    public static void main(String[] args) {
        String inputString = "abcd";
        System.out.println("Substrings of size 2 in reverse order:");
        printSubstringsOfSizeTwo(inputString);
    }
    public static void printSubstringsOfSizeTwo(String str) {
        for (int i = str.length() - 1; i >= 1; i--) {
            String substring = str.substring(i - 1, i + 1);
            System.out.println(substring);
        }
    }
}
