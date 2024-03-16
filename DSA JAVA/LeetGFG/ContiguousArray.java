import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,0,1,0};
        System.out.println(findMaxLength(nums));
    }
    public static int findMaxLength(int[] nums) {
        
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int longestSubarray = 0;

        for(int i = 0; i < n; i++) {
            sum += nums[i] == 0 ? -1 : 1;

            if(sum == 0) {
                longestSubarray = i + 1;
            }

            else if(map.containsKey(sum)) {
                longestSubarray = Math.max(longestSubarray, i - map.get(sum));
            }
            else {
                map.put(sum, i);
            }
        }
        return longestSubarray;
    }
}
// if sum is repeating , iska mtlb subarray betwwen thode indicesz has equal number of zeroes and 1 (-1+1=0)