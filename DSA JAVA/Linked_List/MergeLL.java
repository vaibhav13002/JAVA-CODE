package Linked_List;
// 21 https://leetcode.com/problems/merge-two-sorted-lists/


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode() {
    }
}

public class MergeLL {
    ListNode head;

    public static void main(String[] args) {
        MergeLL list1 = new MergeLL();
        list1.insert(1);
        list1.insert(2);
        list1.insert(4);
        MergeLL list2 = new MergeLL();
        list2.insert(1);
        list2.insert(3);
        list2.insert(4);
        ListNode mergedHead = mergeTwoListNode(list1.head, list2.head);
        System.out.println(mergedHead);
        display(mergedHead);  // 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> null
        // System.out.println("LinkedList:- ");
        // list1.display();
    }

    public void insert(int val) { // Insert At the End
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void delete(int val) { // Delete by value
        if (head == null) {
            return;
        }
        if (head.val == val) {
            head = head.next;
        }
        ListNode temp = head;
        while (temp.next != null && temp.next.val != val) { // loop tab tak chalega jabtk desired element mil nhi jata
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next; // beech ka value bhi ho skta h
        }
    }

    public static void display(ListNode head){
        if(head == null){
            System.out.println("LL is Empty");
        }
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Given is 2 sorted list , need to merge them into one
public static ListNode mergeTwoListNode(ListNode list1 ,ListNode list2){
    ListNode ans = new ListNode();
    ListNode pointer = ans;

    while(list1 != null && list2 != null){
        if(list1.val >= list2.val){
            ans.next = new ListNode(list2.val);   //  This creates a new node with value `list2.val`  // You're trying to assign an int (list2.val) to a ListNode (ans.next), which causes this error:
            list2 = list2.next;
        }else{
            ans.next = new ListNode(list1.val);
            list1 = list1.next;
        }
        ans = ans.next;
    }
    while(list1 != null){
        ans.next = new ListNode(list1.val);
        list1 = list1.next;
        ans = ans.next;
    }
    while(list2 != null){
        ans.next = new ListNode(list2.val);
        list2 = list2.next;
        ans = ans.next;
    }  
    return pointer.next;
  }
}
