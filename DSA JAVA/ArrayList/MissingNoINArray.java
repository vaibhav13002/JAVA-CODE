package ArrayList;

import java.util.ArrayList;

public class MissingNoINArray {

    public static void main(String[] args) {
        int[] nums = {4,1,5,3,0,};
        System.out.println(Sort(nums));
        System.out.println(missingNumber(nums));
        System.out.println(MultiplemissingNumber(nums));
        System.out.println(missingNumber2(nums));
        System.out.println(missingNumberXOR(nums));
    }

    static int Sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];

            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct); //a block pehle sort krke check kr rha h
            } else {
                i++;
            }
        }
        // ab 2 condition se pata lagana h ya tho beech ka element gayab h ya tho last element gayab h
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length; //last element gayab h tho jo ki array me dikhega he nhi
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

    static int missingNumber(int[] nums) {
        int n = nums.length;

        // Iterate from 1 to n and check
        // if the current number is present
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }  // {4,1,5,3,0};

            // If the current number is not present
            if (!found) {
                return i;
            }
        }
        return -1;
    }
    static ArrayList<Integer> MultiplemissingNumber(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();

        // Iterate from 1 to n and check
        // if the current number is present
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }  // {4,1,5,3,0,0};  // ek 0 tho start wala and dusra 0 is 2

            // If the current number is not present
            if (!found) {
                ans.add(i);
            }
        }
        return ans;
    }
// By counting Frequency, whose freq is 0 i.e our missing no.

static int missingNumber2(int[] arr) {
    int n = arr.length + 1;

    // Create hash array of size n+1
    int[] hash = new int[n + 1];

    // Store frequencies of elements
    for (int i = 0; i < arr.length; i++) {
        hash[arr[i]]++;
    }

    // Find the missing number
    for (int i = 1; i <= n; i++) {
        if (hash[i] == 0) {
            return i;
        }
    }
    return -1;
}
static int missingNumberXOR( int[] arr) {
    int xor1 = 0, xor2 = 0;
    int n= arr.length+1;

    // XOR all array elements
    for (int i = 0; i < n - 1; i++) {
        xor2 ^= arr[i];
    }

    // XOR all numbers from 1 to n
    for (int i = 1; i <= n; i++) {
        xor1 ^= i;
    }

    // Missing number is the XOR of xor1 and xor2
    return xor1 ^ xor2;
}
}
