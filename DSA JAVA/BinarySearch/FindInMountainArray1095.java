package BinarySearch;
// 1095. Find in Mountain Array
public class FindInMountainArray1095 {
    public static void main(String[] args) {
        int[] mountainArr = {1,2,3,4,5,3,1};
        int target = 3;
        int peak = findPeak(mountainArr, target,mountainArr.length-1);
        int ans1 = orderAgnosticBS(mountainArr, target, 0, peak);
        int ans2 =orderAgnosticBS(mountainArr, target, peak+1, mountainArr.length-1);
        // int ans1 = binarysearch(mountainArr, target, 0, peak);
        // int ans2 =binarysearch(mountainArr, target, peak+1, mountainArr.length-1);
        if(ans1 != -1){
            System.out.println(ans1);
            // System.out.println(ans2);
        }else{
            System.out.println(ans2);
        }

    }
    public static int findPeak(int[] arr, int start, int end){
        while(start<end){
        int mid=start + (end-start)/2;
        
        if(arr[mid]>arr[mid+1]){  //You Are in Decreasing side
            end=mid;
        }
        else{ //YOu are in Increasing Side  arr[mid] < arr[mid+1]
            start=mid +1; // because we know mid +1 element is grater than mid
        }
    }
    // return start;
    return arr[start];
}
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds
            // the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {  // normal me agr target bada h tho hum right me dhundtey but since array is sorted in descending order the bigger element will be in left side so we will move the end pointer
                    end = mid - 1;   // mid -1 coz mid hota tho answ return hogya hota
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    // static int binarysearch(int[] arr, int target, int start, int end){

    //     while(start <= end){   // Equal to hona chayeh varna last element traverse nhi hoga agr 1 he element hoga tho while loop ka condition he h nhi form hogaa.
    //         int mid=start+(end-start)/2;

    //         if(target < arr[mid]){    //yaha value compare horha h coz array is sorted
    //             end=mid-1;
    //         }
    //         else if(target > arr[mid]){
    //             start=mid +1;
    //         }
    //         else{
    //             return mid; 
    //         }
    //     }
    //     return -1;
    // }
}



// Why Use Order-Agnostic Binary Search in a Mountain Array?
// A mountain array consists of two parts:

// Ascending Part (before the peak)
// Descending Part (after the peak)

// Steps in Solving a Mountain Array Problem:
// Find the Peak Element (using a binary search).
// Search in the Left (Ascending) Half using binary search.
// Search in the Right (Descending) Half using order-agnostic binary search (because it detects descending order automatically).