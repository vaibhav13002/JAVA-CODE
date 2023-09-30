import java.util.Arrays;

public class QuickSorting {
    public static void main(String[] args) {
       int[] arr={5,4,3,2,1};
       sort(arr, 0, arr.length-1); 
       System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums, int low, int hig){
        if(low > hig){
            return;
        }
        int s=low;
        int e=hig;
        int mid= s=(e-s)/2;
        int pivot= nums[mid];

        while (s<=e) {
//also a reason why if it is already sorted it will not swap
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
            }
        }
        sort(nums, low, e);
        sort(nums, s, hig);
    }
}
