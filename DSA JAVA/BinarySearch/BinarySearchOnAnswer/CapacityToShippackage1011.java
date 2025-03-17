package BinarySearch.BinarySearchOnAnswer;
// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

public class CapacityToShippackage1011 {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int start =0;
        int end = 0;

        for(int i=0; i<weights.length; i++){
            start = Math.max(start , weights[i]);
            end += weights[i];
        }

        while(start < end){
        int day = 1;   // kam se kam 1 din tho lagega
        int maxWeight =0;
            int mid = start + (end-start)/2;
            for(int weight : weights){
                if(maxWeight + weight > mid){
                    day++;
                    maxWeight = weight;
                }
                else{
                    maxWeight += weight;
                }
            }
            if(day > days){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}
