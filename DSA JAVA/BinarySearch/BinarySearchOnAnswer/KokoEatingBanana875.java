package BinarySearch.BinarySearchOnAnswer;

public class KokoEatingBanana875 {
    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int hours = 8;
        System.out.println(minEatingSpeed(piles, hours));
    }

    public static int Bruteforce(int[] piles, int hours) {
        int maxPile = 0;

        // Find the maximum pile (worst case, eating 1 pile per hour)
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }

        // Start from speed 1 and go up to maxPile
        for (int time = 1; time <= maxPile; time++) {
            int total = 0;

            // Calculate total hours needed for this speed
            for (int pile : piles) {
                total += (int) Math.ceil((double) pile / time);
            }

            // If the total hours required is within the given limit, return time
            if (total <= hours) {
                return time;
            }
        }

        return maxPile; // Worst case, if no other speed works

        // piles =
        // [332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184]
        // h =
        // 823855818
    }

    //////////////Optimized//////////

    public static int minEatingSpeed(int[] piles, int h) {
        int maxElement = maxElement(piles);
        int low = 1;
        int high = maxElement;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int timeTaken = function(piles, mid);
            if (timeTaken <= h) {  //this is potential answer but we have to find the smaller value
                high = mid - 1;   
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int function(int[] arr, int pile) {  // pile == mid
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += Math.ceil((double) (arr[i]) / (double) (pile));
        }
        return total;
    }

    public static int maxElement(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }

}
