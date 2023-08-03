public class SearchInRotatedArrayBST {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(nums, target));
    }
        static int search(int[] nums, int target) {
            int start = 0, end = nums.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (nums[mid] == target)   //jab mid wala he target ho
                    return mid;  //0 1 2 3 4 5 6  (index)
                    // int[] nums={4,5,6,7,0,1,2};  target=1;
                if (nums[start] <= nums[mid]) { //Left // agar mid=target nhi h tho hum left and right me dhunengey
                    if (nums[start] <= target && target <= nums[mid])
                        end = mid - 1;
                    else
                        start = mid + 1; //Right me check ,,bst lagega
                } 
                // else {   
                //     if (nums[mid] <= target && target <= nums[end])
                //         start = mid + 1;
                //     else
                //         end = mid - 1;
                // }
            }
            return -1;
        }
    }
