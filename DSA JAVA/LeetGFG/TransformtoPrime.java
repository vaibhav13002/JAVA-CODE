package LeetGFG;
// https://www.geeksforgeeks.org/problems/transform-to-prime4635/1
public class TransformtoPrime {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7};
        int n= arr.length;
        System.out.println(minNumber(arr, n));
    }
    public static int minNumber(int arr[], int n)
    {
        int ans=0;
        for(int i=0; i<n; i++){
            ans += arr[i];
        }
        isPrime(ans);
        return findNumberToAddToMakePrime(ans);
    }
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
    private static int findNumberToAddToMakePrime(int num) {
        int toAdd = 0;
        while (!isPrime(num + toAdd)) {
            toAdd++;
        }
        return toAdd;
    }
}
