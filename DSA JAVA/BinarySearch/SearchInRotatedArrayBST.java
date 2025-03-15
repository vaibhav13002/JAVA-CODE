package BinarySearch;

public class SearchInRotatedArrayBST {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        // int[] nums1 = {1,2,3,4,5,6,7,8};
        int target=0;
        // System.out.println(findPivot(nums1));
        System.out.println(search(nums, target));


    }
    public static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        if(pivot == -1){  // It means array is not rotated // sorted array me 3no case fail horhe h bas start pointer badhta jayega and loop break
            return binarysearch(nums, target, 0, nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        } 
        if(target >= nums[0]){  // pivot > target  nhi hog kyuki on both side of pivot we have smaller element then pivot
            return binarysearch(nums, target, 0, pivot-1);
        }  // nums[0] se bada number in between 0,pivot ke rhenegy , after pivot smaller number than nums[0]

            return binarysearch(nums, target, pivot+1, nums.length-1);  
    }
    public static int findPivot(int[] nums){
        int start =0; 
        int end = nums.length-1;

        if (nums.length == 1) {  // if array length is 1 return that index as a pivot or else it will give an error because in further code we are checking mid > mid+1;
            return 0;
        }
        while(start <= end){
            int mid = start + (end-start)/2;

            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }       
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[start] >= nums[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }

    static int binarysearch(int[] arr, int target, int start, int end){
        while(start <= end){   // Equal to hona chayeh varna last element traverse nhi hoga agr 1 he element hoga tho while loop ka condition he h nhi form hogaa.
            int mid=start+(end-start)/2;

            if(target < arr[mid]){    //yaha value compare horha h coz array is sorted
                end=mid-1;
            }
            else if(target > arr[mid]){
                start=mid +1;
            }
            else{
                return mid; 
            }
        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here   // 2 9 2 2 2
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

        // static int search(int[] nums, int target) {
        //     int start = 0, end = nums.length - 1;
        //     while (start <= end) {
        //         int mid = (start + end) / 2;
        //         if (nums[mid] == target)   //jab mid wala he target ho
        //             return mid;  //0 1 2 3 4 5 6  (index)
        //             // int[] nums={4,5,6,7,0,1,2};  target=1;
        //         if (nums[start] <= nums[mid]) { //Left..Ascending me mid lie kr rha h // agar mid=target nhi h tho hum left and right me dhunengey
        //             if (nums[start] <= target && target <= nums[mid])
        //                 end = mid - 1;
        //             else
        //                 start = mid + 1; //Right me check ,,bst lagega
        //         } 
        //         else {  //isme right m // A Part vaise run tho nhi horha but if ka else kuch tho dalna padega na
        //             if (nums[mid] <= target && target <= nums[end])
        //                 start = mid + 1;
        //             else
        //                 end = mid - 1;
        //         }
        //     }
        //     return -1;
        // }
    }
