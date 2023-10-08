package Linked_List;

public class CLL {
    private Node head;
    private Node tail;
    public CLL() {
        this.head = null;
        this.tail = null;
    }

    class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
////////////
public void insert(int val){
    Node node =new Node(val);
    if(head==null){
        head=node;
        tail=node;
        return;
    }
    tail.next=node;
    node.next=head;
    tail=node;
}
//////////////
public void delete(int val){
    Node node = head;
    if(node==null){  //empty condition
        return;
    }
    if(node.val==val){  //head wala condition jav head ko he remove krna ho
        head=head.next;
        tail.next=head;
        return;
    }
    do {
        Node n=node.next;  //head ke baad wala 
        if(n.val==val){
            node.next=n.next;
            break;
        }
        node=node.next; 
    } while (node != head);
}
//////////////
public void display(){
    Node temp =head;
    if(head != null){
        do {
            System.out.print(temp.val+"->");
            temp=temp.next;
        } while (temp !=head);
    }
}
//////////////
    public static void main(String[] args) {
        CLL c=new CLL();
        c.insert(2);
        c.insert(4);
        c.insert(8);
        c.insert(16);
        c.insert(32);
        c.delete(16);
        c.display();
    }
}
