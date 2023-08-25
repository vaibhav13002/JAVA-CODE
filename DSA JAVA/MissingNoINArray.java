
public class MissingNoINArray {
    public static void main(String[] args) {
        int[] nums={3,0,1,5};
        System.out.println(Sort(nums));
    }
    static int Sort(int[] nums){
        int i=0;    
        while(i<nums.length){     
            int correct= nums[i];

            if(nums[i]<nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct); //a block pehle sort krke check kr rha h
            }
            else{
                i++;
            }
        }
        // ab 2 condition se pata lagana h ya tho beech ka element gayab h ya tho last element gayab h
        for(int index=0;index<nums.length;index++){
            if(nums[index] != index){ 
                return index;
            }
        }
        return nums.length; //last element gayab h tho jo ki array me dikhega he nhi
    }
    static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;        

    }
}
