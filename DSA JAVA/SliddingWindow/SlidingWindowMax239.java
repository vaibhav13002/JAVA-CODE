package SliddingWindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


public class SlidingWindowMax239 {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(Arrays.toString(SlidingMax(arr, k)));
    }
    
    public static int[] SlidingMax(int[] arr , int k){
        int n= arr.length;
        int[] ans = new int[n+k-1];
        if(n == 0){
            return ans;
        }
        Deque<Integer> q = new ArrayDeque<>();
        int index =0;
        while(index < k){
            while(!q.isEmpty() && arr[q.peekLast()] <= arr[index]){
                q.pollLast();
            }
            q.offerLast(index);
            index++;
        }
        ans[0] = arr[q.peekFirst()];
        for(int i=1; i<n-k+1; i++){
            if(!q.isEmpty() && q.peekFirst() <= (i-1)){
                q.pollFirst();
            }
            q.offerLast(i+k-1);
            ans[i] = arr[q.peekFirst()];
        }
        return ans;
    }
}
