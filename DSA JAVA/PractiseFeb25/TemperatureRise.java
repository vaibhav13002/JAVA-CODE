package PractiseFeb25;


public class TemperatureRise {
    public static void main(String[] args) {
        int[] k = {70,10,50,30,40,60};
        System.out.println(solution2(k));
    }
    public static  int solution(int[] k) {
        int max = 0;
  
        for (int i = 0; i < k.length; i++) {
            int j = k.length - 1; // Start j from the last index
    
            while (j > i) {  // Ensure j > i to compare elements properly
                int diff = k[j] - k[i];  
                max = Math.max(max, diff);
                j--;  // Move j backward
            }
        }
        return max;
    }
    public static int solution1(int[] k) {
        int diff =0;
        int max=0;
        // write your solution he   re
        for(int i=0; i<k.length; i++){
            for(int j=k.length-1; j>i; j--){
   
                    diff = k[j]-k[i];
                    max= Math.max(diff , max);
            }
        }
        return max;
    }
    public static int solution2(int[] k) {
        int minElement = k[0];
        int maxDiff = 0;
    
        for (int i = 1; i < k.length; i++) {
            maxDiff = Math.max(maxDiff, k[i] - minElement);
            minElement = Math.min(minElement, k[i]);
        }
        return maxDiff;
    }
}
