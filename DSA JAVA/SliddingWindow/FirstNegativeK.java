package SliddingWindow;
// https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeK {
    public static void main(String[] args) {
        int[] arr = { -8, 2, 3, -6, 10 };
        int k = 2;
        System.out.println(FirstNegativeInteger(arr, k));
        System.out.println(FirstNegativeIntegerOptimized(arr, k));
    }

    static List<Integer> FirstNegativeInteger(int arr[], int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length - k + 1; i++) {
            boolean found = false;
            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0) {
                    list.add(arr[j]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                list.add(0);
            }
        }
        return list;
    }

    static List<Integer> FirstNegativeIntegerOptimized(int arr[], int k) {
        Queue<Integer> q = new LinkedList<>();
        int index = 0;
        while (index < k) {    // For the optimzed solution in sliding window hume first window ko khud se create krne hoga if we want to use concept prev element remove and next element add.
            if (arr[index] < 0) {   
                q.offer(arr[index]);     // Agr first window me -ve element mil rha h tho usko queue me add krdo 
            }
            index++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if (q.isEmpty()) {    // Now start filling answer, if there was no -ve element in the queue then add Zero
            ans.add(0);
        } else {
            ans.add(q.peek());   // agar -ve hai tho top -ve ko add krdo // abhi tak humne -ve element ko remove nhi kiya h
        }
        for (int i = 1; i < arr.length - k + 1; i++) {  // Now the 1 element, first window ka humne krdiya h it means loop 1 se chalu hoga and we can use arr[i-1]
            if (arr[i - 1] < 0) {  // agar 1st element in the queue is -ve jo ki humne ans me already add krdiya h ussey nikal do
                q.poll();   
            }
            if (arr[i + k - 1] < 0) {  // Incrasing the window, next element of the window, if it is -ve add it into the queue
                q.offer(arr[i + k - 1]);
            }
// Above 2 steps me humne window ko slide kiya h, and at the same time queue ko khali
            if (q.isEmpty()) {  // now for the next window again check ki khali h mtlb uss window me sab +ve element tha
                ans.add(0);
            } else {
                ans.add(q.peek());  // agr empty nhi h tho mtlb -ve element he h , coz bas vahi hum queue me add kr rhe h
            }
        }
        return ans;
    }
}
