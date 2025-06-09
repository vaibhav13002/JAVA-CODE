package Linked_List;

import java.util.ArrayList;

public class ReorderList143 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        // Build an example list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original list: ");
        printList(head);

        // Reorder
        new ReorderList143().reorderList(head);

        System.out.print("Reordered list: ");
        printList(head);
    }

    // Helper to print a list
    private static void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val);
            if (cur.next != null)
                System.out.print(" -> ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        // 1. Dump all nodes into a List (or array)
        ArrayList<ListNode> nodes = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            nodes.add(cur);
            cur = cur.next;
        }

        // 2. Use two pointers to weave from front and back
        int left = 0;
        int right = nodes.size() - 1;
        while (left < right) {
            // Connect left → right 1->4
            nodes.get(left).next = nodes.get(right);
            left++;

            // If pointers crossed, break
            if (left > right)
                break;

            // Connecting right → left 4->2
            nodes.get(right).next = nodes.get(left);
            right--;
        }

        // 3. Terminate the list
        nodes.get(left).next = null;
    }
}
