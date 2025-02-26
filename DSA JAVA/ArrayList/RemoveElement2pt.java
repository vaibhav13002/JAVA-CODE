package ArrayList;
//a code given value ko remove krke return me bache kitne h o print kr rha h
public class RemoveElement2pt {
    public static void main(String[] args) {
        int[] nums={3,2,2,3,4};
        int value=2;
        System.out.println(Remove(nums, value));
    }
    public static int Remove(int[] nums, int value){
        //  Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            // if(nums[i]=null){
            //     return 0;
            // }
            if(nums[i]!=value){
                count++;
                // i++;
            }
        }
        return count;
    }
}
