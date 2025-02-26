package PractiseFeb25.ArrayPractF25;

public class MaxSubArraySum {
    public static void main(String[] args) {
       int[] arr = {2, 3, -4, 10}; 
       System.out.println(Sum(arr));
       System.out.println(maxSubArray(arr));
       System.out.println(maxSubArray1(arr));
    }
    public static int Sum(int[] arr){
        int ans=arr[0];
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            max= Math.max(max+arr[i], arr[i]);
            // System.out.println(max);
            ans=Math.max(ans, max);
        }
        return ans;
    }
    public static int maxSubArray1(int[] nums) {
        // int maxi = Integer.MIN_VALUE; // maximum sum..kyuki agr negative no. ayega while comparing Math.max so zero to ussey bada he hoga na so we will take min possible value by this
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            
            if (currentSum < 0) {  // Jaha current sum negative ho ja rha h uska matlb abtk ka subarray ka sum negative h and usko consider krne ka kuch faida nhi o hamarey max sum ko kam krega. pointing to 0 ka mtlb ab hum new sab array lengey from the next positive number
                currentSum = 0;
            }
        }
        
        return maxSum;
    }

    public static int maxSubArray(int[] nums) {   // too slow cubic complexity
        int maxi = 0; // maximum sum
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // subarray = arr[i.....j]
                int sum = 0;

                //add all the elements of subarray:
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }

                maxi = Math.max(maxi, sum);
            }
        }

        return maxi;
    }
}


// in this code basically the catch is if during making and calculating sum of max subarray if current calculated sum is less then next element it will be good to start new subarray from that bigger element right?