package BinarySearch;
public class MountainOfArray {
    public static void main(String[] args) {
        int[] arr={0,2,3,1,0};
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start + (end-start)/2;
            
            if(arr[mid]>arr[mid+1]){  //You Are in Decreasing side
                end=mid;
            }
            else{ //YOu are in Increasing Side
                start=mid +1;
            }
        }
        //return start;
    }
}
