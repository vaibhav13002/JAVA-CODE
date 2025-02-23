package Blind75;

import java.util.Arrays;

public class ProductOfArrayExceptSelf238 {
    public static void main(String[] args) {
        int[] nums = { -1, 1, 0, -3, 3 };
        System.out.println(Arrays.toString(productExceptSelf2(nums)));
    }

    public static int[] productExceptSelf(int[] nums) { // fails when number is zero
        int[] ans = new int[nums.length];
        int NetMul = 1;
        for (int i = 0; i < nums.length; i++) {
            NetMul *= nums[i];
        }
        int index = 0;
        for (int a : nums) {
            ans[index++] = NetMul / a;
        }
        return ans;
    }

    public static int[] productExceptSelf1(int[] nums) { 
        int[] ans = new int[nums.length];
        int NetMul = 1;
        for (int i = 0; i < nums.length; i++) {
            NetMul *= nums[i];
        }
        int index = 0;
        for (int a : nums) {
            int left = 1;
            int right = 1;
            int both = 1;
            if (a != 0) {
                ans[index++] = NetMul / a;
            } else {
                for (int i = 0; i < index; i++) {
                    left *= nums[i];
                }
                for (int j = index + 1; j < nums.length; j++) {
                    right *= nums[j];
                }
                both = left * right;
                ans[index++] = both;
            }
        }
        return ans;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }

    public static int[] UsingPrefix(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1]; // prefix
        }
        int suffix = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            ans[j] *= suffix;
            suffix *= nums[j];
        }
        return ans;
    }
}



// result[i] = (product of all elements before i) * (product of all elements after i)
// Let's call:

// The product of all elements before i: "left product" or L[i]
// The product of all elements after i: "right product" or R[i]

// So, our formula becomes:
// result[i] = L[i] * R[i]
// Now, how do we calculate L[i] and R[i]?

// Left products (L[i]):
// L[0] = 1 (no elements to the left of the first element)
// L[1] = nums[0]
// L[2] = nums[0] * nums[1]
// L[3] = nums[0] * nums[1] * nums[2]
// ...and so on.
// We can see that L[i] = L[i-1] * nums[i-1]
// Right products (R[i]):
// R[n-1] = 1 (no elements to the right of the last element)
// R[n-2] = nums[n-1]
// R[n-3] = nums[n-1] * nums[n-2]
// ...and so on.
// We can see that R[i] = R[i+1] * nums[i+1]