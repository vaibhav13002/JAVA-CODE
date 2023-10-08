package Linked_List;

public class DLL {
    private Node head;
    class Node {
        int val;      // This is an instance variable representing the data or value stored in the node.//Data or value stored in the node
        Node next;    // Reference to the next node in the linked list
        Node prev;    // Reference to the previous node in the linked list
    
        // Constructor to create a node with a value
        public Node(int val) {
            this.val = val;
        }
        // Constructor to create a node with a value, next, and prev references
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
//////////////////
    public void inserFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
/////////////////
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next=null;

        if(head==null){ //if linked list is empty// zero pointer exception
            node.prev=null;
            head=node;
            return;
        }
        while(last.next !=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }
///////////////// adding after a particular value
    public Node find(int value){
        Node node = head;
        while(node !=null){
            if(node.val==value){
            return node;
        }
        node=node.next;
    }
    return null; //if nothing is found
}
public void insert(int after, int val){
    Node p=find(after);  //p me after ka index value ya node postn store hojayega ref
    if(p==null){
        System.out.println("does not exist");
    }
    Node node= new Node(val);
    node.next=p.next;
    p.next=node;
    node.prev=p;
    if(node.next != null){
        node.next.prev=node;
    }
}
/////////////////
    public void display(){
        Node node=head;
        Node last=null;
        while(node != null){
            System.out.print(node.val+"->");
            last=node;  //: This line updates the last variable to point to the current node. As the loop progresses, last will always point to the last node that has been visited so far.
            node=node.next;
        }
        System.out.println("END");
/////////////////
       System.out.println("Print in Reverse"); 
        while(last != null){ //jabtk start ke side wala null nhi ajata
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.println("START");
    }
//////////////////
    public static void main(String[] args) {
        DLL list=new DLL();
        list.inserFirst(0);
        list.inserFirst(1);
        list.inserFirst(2);
        list.inserFirst(3);
        list.inserFirst(4);
        list.insertLast(99);
        list.insert(99, 100);

        list.display();
    }
}
