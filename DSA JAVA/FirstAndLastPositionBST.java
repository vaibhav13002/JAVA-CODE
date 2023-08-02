public class FirstAndLastPositionBST {
    public static void main(String[] args) {
//iska output vs code me ni aarha tha
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=search(nums, target, true);
        int end=search(nums, target, false);

        ans[0]=start;
        ans[1]=end;

        return ans;
    }

    static int search(int[] nums,int target,boolean FindStartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        
        while(start <= end){
        int mid=start+(end-start)/2;

            if(target < nums[mid]){    //yaha value compare horha h coz array is sorted
                end=mid-1;
            }
            else if(target > nums[mid]){
                start=mid +1;
            }
            else{
            //Potential answer found
            ans=mid;
            if(FindStartIndex){
                end=mid-1;   //yaha ka jo bhi index value hoga vahi upr method me jayega
            }
            else{
                start=mid+1;
            }
               }
        }
      return ans;
    }
}
