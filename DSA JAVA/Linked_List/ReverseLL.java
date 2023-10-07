package Linked_List;

import java.util.LinkedList;

public class ReverseLL {
     public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<Integer>();
        list.add(123);
        list.add(12);
        list.add(11);
        list.add(1134);
    }
    public ListNode reverseList(ListNode head){
                // Special case...
                if (head == null || head.next == null) return head;
                // Create a new node to call the function recursively and we get the reverse linked list...
                ListNode res = reverseList(head.next);
                // Set head node as head.next.next...
                head.next.next = head;
                //set head's next to be null...
                head.next = null;
                return res; 
    }
}
