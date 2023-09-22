public class RotatedBSRecursion {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(Search(arr, 1, 0, arr.length-1));
    }
    static int Search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid= s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s] <= arr[mid]){  // if left part is sorted
            if(target >= arr[s] && target<= arr[mid]){
                return Search(arr, target, s, mid-1);
            }else{
                return Search(arr, target, mid+1, e);
            }
        }
        if(target >= arr[mid] && target <= arr[e]){
                return Search(arr, target, mid+1, e);   
        }
        return Search(arr, target, s, mid-1);
    }
}
