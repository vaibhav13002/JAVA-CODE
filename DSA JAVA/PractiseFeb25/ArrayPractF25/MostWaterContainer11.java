package PractiseFeb25.ArrayPractF25;

public class MostWaterContainer11 {
    public static void main(String[] args) {
        int[] height = {8,7,2,1};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {  // Time limit Excedded
        int ans = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) { // Start from i+1
                int CurrArea = (j - i) * Math.min(height[i], height[j]); // Use Math.min()
                ans = Math.max(CurrArea, ans); // Update ans properly
            }
        }
        return ans;
    }
}
 