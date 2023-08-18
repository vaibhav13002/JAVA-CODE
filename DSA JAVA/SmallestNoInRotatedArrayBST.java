

public class SmallestNoInRotatedArrayBST {
    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
        
        System.out.println(SearchInRotated(nums));
}

        static int SearchInRotated(int[] nums){
        int start=0,end=nums.length-1, ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[start]<= nums[mid]){
                ans=Math.min(ans,nums[start]);
                start=mid+1;
            }
            else{
                ans=Math.min(ans,nums[end]);
                end=mid-1;
        }

    }
    return ans;
}
    }
