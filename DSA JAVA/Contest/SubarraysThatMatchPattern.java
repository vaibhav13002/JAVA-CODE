package Contest;
// Weekly Contest 384
public class SubarraysThatMatchPattern {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6};
        int[] patterns = {1,1};
        System.out.println(countMatchingSubarrays(nums, patterns));
    }
    public static int countMatchingSubarrays(int[] nums, int[] pattern) {
    int n = nums.length;
    // System.out.println(n);
    int m = pattern.length;
    int count = 0;

    for (int i = 0; i <= n - m - 1; i++) {
        boolean match = true;
        for (int j = 0; j < m; ++j) {
            if ((pattern[j] == 1 && nums[i + j + 1] <= nums[i + j]) || (pattern[j] == 0 && nums[i + j + 1] != nums[i + j]) || (pattern[j] == -1 && nums[i + j + 1] >= nums[i + j])) {
                match = false;
                break;
            }
        }
        if (match) {
            count++;
        }
    }
    return count;
    }
}
