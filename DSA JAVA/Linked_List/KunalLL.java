package Linked_List;

public class KunalLL {

        private Node head;
        private Node tail;
        private int size;
    public KunalLL(){
    this.size=0;
    }

    private class Node{
        private int value;
        private Node next;

    public Node(int value){
        this.value=value;
    }
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
        }
///////////////
public void InsertFirst(int val){
    Node node=new Node(val);
    node.next=head;
    head=node;
    if(tail==null){ //if list is empty and we added 1 item
        tail=head;
    }
    size++;
}
//////////////
public void InsertLast(int val){
    if(tail==null){
        InsertFirst(val); //agr tail null h tho iska mtlb no node is there so we call the normal InsertFirst method tho insert a new node
        return;
    }
    Node node =new Node(val); //creating new node of value which we will give
    tail.next=node;
    tail=node;
    size++;
}
///////////////////
public void AddIndex(int val, int index){
    if(index==0){
        InsertFirst(val);
        return;
    }
    if(index==size){
        InsertLast(val);
        return;
    }
    Node temp = head;
    for(int i=1; i<index;i++){
        temp=temp.next;
    }
    Node node = new Node(val, temp.next); // iske liye a constructor call horha h
      temp.next=node;                      // public Node(int value, Node next) {
      size++;                              //  this.value = value;
       }                                 //  this.next = next;
                                           // }         //Node next he bata rha h ki new node kisko point krna chayeh to maintain continuity
////////////////////
public void Display(){
    Node temp=head; //new pointer which will also point head
    while(temp !=null){
        System.out.print(temp.value+"->");
        temp=temp.next;
    }
    System.out.println("END");
}

    public static void main(String[] args) {
        KunalLL list = new KunalLL();
        list.InsertFirst(1);
        list.InsertFirst(2); 
        list.InsertFirst(3); 
        list.InsertFirst(4); 
        list.InsertLast(99);
        list.AddIndex(100, 2);
        list.Display();    
    }
}
