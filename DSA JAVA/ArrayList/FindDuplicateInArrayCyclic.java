package ArrayList;
public class FindDuplicateInArrayCyclic {
    public static void main(String[] args) {
        int[] nums={1,3,4,5,3};
        System.out.println(Check(nums));
    }
    static int Check(int[] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int correct= nums[i]-1;
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
            }
                else{
                  return nums[i];
                  }
            }
            else{
                i++;
                }
        }
        return -1;
  
    
    }
    static void swap(int[] nums, int i, int correct) {
        int temp=nums[i];
        nums[i]=nums[correct];
        nums[correct]=temp; 
    }
}
