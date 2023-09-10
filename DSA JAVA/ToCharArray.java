import java.util.Arrays;

public class ToCharArray {
    public static void main(String[] args) {
        String s="Vaibhav";
        char[] k=s.toCharArray();
        System.out.println(Arrays.toString(k));
    }
}





 if (A == null) {
            return B;
        }
        if (B == null) {
            return A;
        }

        ListNode DHead = new ListNode(0);
        ListNode curr = DHead;

        while (A != null && B != null) {
            if (A.val < B.val) {
                curr.next = A;
                A = A.next;
            } else {
                curr.next = B;
                B = B.next;
            }
            curr = curr.next;
        }

        if (A != null) {
            curr.next = A;
        } else {
            curr.next = B;
        }

        return DHead.next;



        int n = A.size();
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
              if (A.get(i) > A.get(i - 1)) {
                maxProfit += A.get(i) - A.get(i - 1);
            }
        }

        return maxProfit;

        int n = A.length;
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            // Buy the stock if it's profitable (price is lower than the next day)
            if (A[i] > A[i - 1]) {
                maxProfit += A[i] - A[i - 1];
            }
        }

        return maxProfit;
