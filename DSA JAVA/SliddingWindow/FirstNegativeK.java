package SliddingWindow;
// https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeK {
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        System.out.println(FirstNegativeInteger(arr, k));
        System.out.println(FirstNegativeIntegerOptimized(arr, k));
    }
        static List<Integer> FirstNegativeInteger(int arr[], int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length-k+1; i++){
            boolean found = false;
            for(int j=i; j<i+k; j++){
                if(arr[j] < 0){
                    list.add(arr[j]);
                    found = true;
                    break;
                }
            }
            if(!found){
                list.add(0);
            }
        }
        return list;
    }
        static List<Integer> FirstNegativeIntegerOptimized(int arr[], int k) {
        Queue<Integer> q = new LinkedList<>();
        int index = 0;
        while(index < k ){
            if(arr[index] < 0){
                q.offer(arr[index]);
            }
            index++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(q.isEmpty()){
                ans.add(0);
            }else{
                ans.add(q.peek());
            }
        for(int i=1; i<arr.length-k+1; i++){
            if(arr[i-1] < 0){
                q.poll();
            }
            if(arr[i+k-1] < 0){
                q.offer(arr[i+k-1]);
            }
                    if(q.isEmpty()){
                ans.add(0);
            }else{
                ans.add(q.peek());
            }
        }
        return ans;
    }
}
