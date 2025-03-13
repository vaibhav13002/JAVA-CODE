package SliddingWindow;

public class SubstringContainingAllChar1358 {
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(Substring(s));

    }

    public static int Substring(String s) {
        int[] arr = new int[3];
        int start = 0;
        int count = 0;

        for (int end = 0; end < s.length(); end++) {
            arr[s.charAt(end) - 'a']++;

            while (arr[0] > 0 && arr[1] > 0 && arr[2] > 0) {
                count += s.length() - end;
                arr[s.charAt(start) - 'a']--;  // window size decreasing

                start++;
            }

        }
        return count;
    }
}
