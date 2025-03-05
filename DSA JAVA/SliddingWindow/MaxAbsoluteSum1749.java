package SliddingWindow;

public class MaxAbsoluteSum1749 {
    public static void main(String[] args) {
        int[] nums = {2,-5,1,-4,3,-2};
        System.out.println(maxAbsoluteSum(nums));
        System.out.println(maxAbsoluteSum1(nums));
    }
    public static int maxAbsoluteSum(int[] nums) {
        int ansP=nums[0];
        int maxP=nums[0];
        int ansN=nums[0];
        int minN=nums[0];
        for(int i=1; i<nums.length; i++){   
            maxP= Math.max(maxP+nums[i], nums[i]);
            // System.out.println(max);
            ansP=Math.max(ansP, maxP);
        }
        for(int i=1; i<nums.length; i++){
            minN= Math.min(minN+nums[i], nums[i]);
            // System.out.println(max);
            ansN=Math.min(ansN, minN);
        }
        int FinalN = Math.abs(ansN);
        if(FinalN > ansP){
            return FinalN;
        }
        return ansP;
    }

    public static int maxAbsoluteSum1(int[] nums) {
        int sum=0;
        int minSum=0;
        int maxSum=0;

        for(int num : nums){
            sum += num;
            if(sum > maxSum){
                maxSum = sum;  //1/3/
            }
            if(sum < minSum){
                minSum = sum; //-2/
            }
        }
        // return Math.abs(maxSum - minSum);  // 3-(-2)
        return (maxSum - minSum); 
    }
}
