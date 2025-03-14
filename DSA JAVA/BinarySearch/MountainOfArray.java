package BinarySearch;
// Find Peak/Maximum Element

public class MountainOfArray {
    public static void main(String[] args) {
        int[] arr={0,2,3,1,0};
        int start=0;
        int end=arr.length-1;
        System.out.println(findPeak(arr, start, end));

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
}
