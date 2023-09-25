package Pattern_Recursion;
import java.util.* ;
//merge sort using recursion apna college
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,5,3};
        arr=mergesort(arr);  //have to update an array so fun calling will be like this
        System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(mergesort(arr)));
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid=arr.length/2;

        int[] left=mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    private static int[] merge(int[] left, int[] right) {
        int[] mix= new int[left.length + right.length];
        int i=0; //left
        int j=0; //right
        int k=0;
        while(i<left.length && j<right.length){ //a tab tk valid h jab tk dono me same elemnent h agr ek jayda bada h tho usko alag se last me add krna hoga
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
            while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
}
