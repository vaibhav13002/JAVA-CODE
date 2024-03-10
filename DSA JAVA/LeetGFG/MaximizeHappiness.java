package LeetGFG;

import java.util.Arrays;

public class MaximizeHappiness {
    public static void main(String[] args) {
        int[] happiness={2,3,4,5};
        int k=1;
        System.out.println(Check(happiness, k));
    }
    public static long Check(int[] happiness, int k){
        // Arrays.sort(happiness);
        // int a=0;
        // int count=0;
        // for(int i=k-1; i>=0; i--){
        //     if(happiness[i]>0){
        //         a+=happiness[i]-i;
        //         count++;
        //     }
        // }
        // return a;
        Arrays.sort(happiness);
        long ans=0;
        int n= happiness.length;
        int i=0;
        int j=n-1;
        
        while(i<k){
            ans+=Math.max(0,happiness[j]-i);
            i++;
            j--;
        }
        return ans;
    }
}
