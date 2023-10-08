package Linked_List;

public class RemoveDuplicate {
    Node head;

    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
        public void duplicate(){
        Node node=head;
        while(node.next !=null){
            if(node.val==node.next.val){
                node.next=node.next.next;
            }else{
                node=node.next;
            }
        }
    }
    public void InsertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
    }
    public void Display(){
        Node temp=head; //new pointer which will also point head isko iterate krke values print krengey as wqe cannot change the position of head pointer varna uske pehle ka list remove ho jayega
        while(temp !=null){
            System.out.print(temp.val+"->"); //temp.value mtlb uss postn pr value kya h
            temp=temp.next; //to move iteration
        }
        System.out.println("END");
    }
    public Node removeDuplicates(Node head)
    {
        Node current = head;
        
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip all consecutive duplicates until a different value is found.
                Node nextDifferent = current.next.next;
                while (nextDifferent != null && nextDifferent.val == current.val) {
                    nextDifferent = nextDifferent.next;
                }
                current.next = nextDifferent;
            }
            current = current.next;
        }
        
        return head;
    }
    public static void main(String[] args) {
        RemoveDuplicate R=new RemoveDuplicate();
        R.InsertFirst(1);
        R.InsertFirst(1);
        R.InsertFirst(2);
        R.InsertFirst(3);
        R.InsertFirst(4);
        R.InsertFirst(4);
        R.InsertFirst(4);
        R.InsertFirst(4);
        R.duplicate();
        R.Display();
    }

}
