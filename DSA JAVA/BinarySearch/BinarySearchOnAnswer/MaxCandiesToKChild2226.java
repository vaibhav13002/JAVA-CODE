package BinarySearch.BinarySearchOnAnswer;

public class MaxCandiesToKChild2226 {
    public static void main(String[] args) {
        int[] candies = {4,7,5};
        int k = 4;
        System.out.println(maximumCandies(candies, k));
    }
    public static int maximumCandies(int[] candies, long k) {
        long max = 0;
        for(int candy : candies)
            max = Math.max(max, candy);
        
        long left = 1, right = max;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (isAllotable(candies, mid, k)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int)left - 1;
    }
    private static boolean isAllotable(int[] candies, long maxNumberOfCandies, long k) {
        long countOfChildren = 0;
        
        for (int candy : candies) {  //  4/4=1 means 1 child is served  7/3=2
            countOfChildren += (long)(candy / maxNumberOfCandies);
        } 
        return countOfChildren >= k;
    }
}
