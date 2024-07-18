package IB;

public class MaxProfit {
    public static void main(String[] args) {
        // int[] prices = {5,6,4,3,2,1};
        int[] prices = {7,1,5,3,6,4};
        System.out.println(helper(prices)); 
    }
    public static int helper(int[] arr){
        if(arr==null || arr.length == 0){
            return 0;
    }
        int minPrice = 9999;
        int maxProfit = 0;
        
        for(int price : arr){
        if( price < minPrice){
        minPrice = price;
      }else if( price - minPrice > maxProfit){
        maxProfit = price -minPrice;
        }

      }
      return maxProfit;
    }
}
