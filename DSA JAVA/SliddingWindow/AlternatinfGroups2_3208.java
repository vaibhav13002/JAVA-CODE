package SliddingWindow;
// 3206. Alternating Groups I

public class AlternatinfGroups2_3208 {
    public static void main(String[] args) {
        int[] colors = { 0, 1, 0, 1, 0 };
        int k = 3;
        System.out.println(Group(colors, k));
        System.out.println(numberOfAlternatingGroups(colors, k));

    }

    ///////////// Wrong Solution //////////////////////
    /// // System.arraycopy(sourceArray, sourceStartIndex, destinationArray, destinationStartIndex, numberOfElementsToCopy);
    public static int Group(int[] colors, int k) {
        int n = colors.length;
        int[] result = new int[colors.length];

        for (int i = 0; i < colors.length - 1; i++) { // Ensure i does not reach last index
            int j = i + 1; // Make sure j is within bounds
            if (j < n && colors[i] == colors[j]) {
                // Copy right part to the start
                System.arraycopy(colors, j, result, 0, n - j);
                System.arraycopy(colors, 0, result, n - j, j);
                if (check(result)) {
                    return 0;
                }
            }
        }
        if (check(result)) { // agar ek baar swap ke baad bhi sahi pattern nhi form horha h tab.
            return 0;
        }
        return n - k + 1;
    }

    public static boolean check(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            if (j < arr.length && arr[i] == arr[j]) {
                return true;
            }
        }
        return false;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public static int numberOfAlternatingGroups(int[] colors, int k) {
            int n = colors.length;
            int right = 0;
            int left= 0;
            int ans = 0;
    
            while(left < n && right < n+k){
                if( right - left +1 == k){  // +1 kyuki zero based index
                    ans++;
                    left++;
                }
                if(colors[right%n] == colors[(right+1)%n]){  // index n+k tak jayega so this is making and aaray cyclic and also checking dulicate element
                    left = right+1;  // Jab dublicate ayega to left and right ke beech ka data kuch kaam ka nhi agr hota tho k ke equal hota and counter increase hogya rehta since r and r+1 are same so it is better to start the new window from r+1
                }
                right++;   // har ek iteration ke baad r ka value increment tho krna  he hai
            }
            return ans;
        }
}
