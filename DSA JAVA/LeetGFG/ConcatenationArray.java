package LeetGFG;

import java.util.Arrays;

public class ConcatenationArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];

     
            for(int j=0; j<n; j++){
                ans[j]=ans[j+n]=nums[j];

        }
        return ans;
    }
}
