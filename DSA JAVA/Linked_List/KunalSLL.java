package Linked_List;

public class KunalSLL {

        private Node head;
        private Node tail;
        private int size;
    public KunalSLL(){
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
//////////////InsertLast
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
public int DeleteFirst(){
    int val=head.value; 
    head=head.next;
    if(head==null){
        tail=null;
    }
    size--;
    return val;
}
///////////////////
public Node get(int index){
    Node node = head;
    for(int i=0;i<index;i++){
        node =node.next;
    }
    return node;
}
public int DeleteLast(){
    if(size<=1){
        return DeleteFirst();
    }
    Node secondlast=get(size-2); //size 0 se nhi 1 se caount hota h and index 0 se
    int val=tail.value;
    tail=secondlast;
    tail.next=null;
    return val;
}
//////////////////At any Index
public int delete(int index){
    if(index==0){
        return DeleteFirst();
    }
    if(index==size-1){
        return DeleteLast();
    }
    Node prev=get(index-1); //prev variable is getting created
    int val=prev.next.value;  //jo remove kr rhe h usko ek temp me store kr rhe h// return typ int h so Value he ayega 

    prev.next=prev.next.next; //new link is created
    return val;  //isike vajah se print horha h jo hum remove kr rhe h o
}
/////////////////Find the index
public Node find(int value){
    Node node = head;
    while(node !=null){
        if(node.value==value){
            return node;
        }
        node=node.next;
    }
    return null; //if nothing is found
}
////////////////
public void Display(){
    Node temp=head; //new pointer which will also point head isko iterate krke values print krengey as wqe cannot change the position of head pointer varna uske pehle ka list remove ho jayega
    while(temp !=null){
        System.out.print(temp.value+"->"); //temp.value mtlb uss postn pr value kya h
        temp=temp.next; //to move iteration
    }
    System.out.println("END");
}

    public static void main(String[] args) {
        KunalSLL list = new KunalSLL();
        list.InsertFirst(1);
        list.InsertFirst(2); 
        list.InsertFirst(3); 
        list.InsertFirst(4); 
        list.InsertLast(99);
        list.AddIndex(100, 2);
        list.Display();    
        // list.DeleteFirst();
        System.out.println(list.DeleteLast());  //issey dikhega int val kyu use kiya h....jo remove kr rhe h usko print krna ya return krna
        list.Display();
        System.out.println(list.delete(1));
       
        list.Display();
        list.find(2);//recheck
    }
}
