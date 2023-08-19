import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={2,5,4,1,3};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] arr){
        int i=0;
        while(i<arr.length){    
            int correct= arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;        

    }
}
