package LeetGFG;

import java.util.Arrays;

public class AppleInBox {
    public static void main(String[] args) {
        int[] apple={1,3,2};
        int[] capacity={4,3,1,5,2};
        System.out.println(Check(apple, capacity));
        
    }
    public static int Check(int[] apple, int[] capacity){
        int a = 0;
        for(int i=0; i<apple.length; i++){
           a +=apple[i];
        }
        // System.out.println(a);

        int count=0;
        Arrays.sort(capacity);
  
            for(int i=capacity.length-1; i>=0; i--){
                a-= capacity[i];
                count++;
                if(a<=0){
                    break;
                }
            }
        return count;
    }
}
