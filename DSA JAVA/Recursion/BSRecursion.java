package Recursion;
public class BSRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target=4;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
    static int search(int[] arr, int target,int s, int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr, target, s, m-1);  //function calling
        }
        return search(arr, target, m+1, e); // a else condition h since function me return typr bola h tho kuch ttho return krna padega
    }                                       // target> arr[m];
}
