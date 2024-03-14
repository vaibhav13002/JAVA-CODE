package LeetGFG;

public class StringInStringRepeat {
    public static void main(String[] args) {
        String str1 = "abcabcabcabc";
        String str2 = "abc";
        int occurrences = countSubstringOccurrences1(str1, str2);
        System.out.println("Number of occurrences of \"" + str2 + "\" in \"" + str1 + "\": " + occurrences);
    }

    public static int countSubstringOccurrences(String str1, String str2) {
        int count = 0;
        int index = 0;

        // Iterate through the string while there are occurrences of str2
        while ((index = str1.indexOf(str2, index)) != -1) {
            count++;
            // Move the index forward to check for the next occurrence
            index += str2.length();
        }

        return count;
    }

    // Bruteforce method
    public static int countSubstringOccurrences1(String str1, String str2) {
        int count = 0;
        int len1 = str1.length();
        int len2 = str2.length();

        // Iterate over all possible substrings of str1
        for (int i = 0; i <= len1 - len2; i++) {
            // Check if the substring starting from index i matches str2
            if (str1.substring(i, i + len2).equals(str2)) {
                count++;
            }
        }
        return count;
    }

}
