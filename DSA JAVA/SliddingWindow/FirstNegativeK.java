package SliddingWindow;

import java.util.ArrayList;
import java.util.List;

// https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
public class FirstNegativeK {
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        System.out.println(FirstNegativeInteger(arr, k));
    }
        static List<Integer> FirstNegativeInteger(int arr[], int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length-k+1; i++){
            for(int j=i; j<i+k-1; j++){
                if(arr[j] < 0){
                    list.add(arr[j]);
                    break;
                }else{
                    list.add(0);
                }
            }
        }
        return list;
    }
}
