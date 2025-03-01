package SliddingWindow;


public class MaximumSumSubarray {
    public static void main(String[] args) {
        int[] arr = {100,200,300,400,500};
        int k=2;
        System.out.println(MaxSum(arr, k));

    }
    public static int MaxSum(int[] arr , int k){ //BruteForce
        int max=0;
        for(int i=0; i<arr.length-k+1; i++){
            int sum=0;
            for(int j=i; j<i+k; j++){  // k baar to run hona he h but start ko add krna padega taki jaha se start horha h vaha se k element pr iterate ho
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
