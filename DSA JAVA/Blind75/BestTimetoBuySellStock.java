package Blind75;

public class BestTimetoBuySellStock {
    public static void main(String[] args) {
        int[] prices = {2,1,4};
        // System.out.println(maxProfit(prices));
        BestTimetoBuySellStock obj = new BestTimetoBuySellStock();  // accessing non static method
        System.out.println(obj.maxProfit1(prices));
    }
    public static int maxProfit(int[] prices) { //time limit excedded
        int maxDifference = 0;
        // int b= Integer.MIN_VALUE;

        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                int difference = prices[j] - prices[i];
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }
        }
        return maxDifference;
    }

    public int maxProfit1(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static int maxProfit2(int[] prices) {
        if (prices.length < 2) {
            return 0; // Not enough elements to find a difference
        }
    
        int maxDifference = 0;
        int minPrice = prices[0];
    
        for (int i = 1; i < prices.length; i++) {
            maxDifference = Math.max(maxDifference, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
    
        return maxDifference;
    }
    
}
