package PractiseFeb25.ArrayPractF25;

import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums= {3,2,4};
        int target= 6;
        int[] ans = new int[2];
        int start=0;
        int next=start+1;
        // System.out.println(Arrays.toString(Mysoln(nums,target,start,next,ans)));
        System.out.println(Arrays.toString(soln(nums, target, start, next, ans)));
    }
    public static int[] Mysoln(int nums[], int target, int start, int next,int[] ans){    // Wrong
        for(int i=0; i<nums.length; i++){
            if(nums[start]+nums[next]==target || start>=nums.length-1){
                ans[0]=start;
                ans[1]=next;
                return ans;
            }else{
                return Mysoln(nums, target, start, next+1, ans);
            }
        }
        return Mysoln(nums,target,start+1,next,ans);
    }

    public static int[] soln(int nums[], int target, int start, int next, int[] ans) {
        if (start >= nums.length - 1){
            return new int[]{};    // Base case: No solution found
        } 
        if (next >= nums.length){
            return soln(nums, target, start + 1, start + 2, ans);  // Move start to next index
        } 

        if (nums[start] + nums[next] == target) {
            ans[0] = start;
            ans[1] = next;
            return ans;
        }

        return soln(nums, target, start, next + 1, ans); // Move to next index
    }
}

