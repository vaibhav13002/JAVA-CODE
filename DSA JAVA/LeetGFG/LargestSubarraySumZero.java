package LeetGFG;


import java.util.HashMap;


public class LargestSubarraySumZero {
    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10,23};
        int n=arr.length;
        System.out.println(count(arr, 0,n));
    }
    public static int count(int[] arr, int sum, int n){
        int maxSubArrayLength=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,-1);
        sum=0;
        for(int i=0; i<n; i++){
            sum +=arr[i];
            if(map.containsKey(sum)){
                maxSubArrayLength= Math.max(maxSubArrayLength, i-map.get(sum));
                // map.get(sum); return the sum jo pehle start me occur hua h pehli baar
            }else{
                map.put(sum,i);
            }
        }
        return maxSubArrayLength;
    }
}
//when the sum becomes exactly zero, it signifies that the entire array up to t hat point has a cumulative sum of zero.