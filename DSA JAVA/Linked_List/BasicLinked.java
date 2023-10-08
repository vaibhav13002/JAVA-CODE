package Linked_List;


public class BasicLinked {
    Node head;
    private int size;

    BasicLinked() { // default constructor of our class
        this.size = 0; // initial size will be 0
    }

    class Node {
        String data;
        Node next; // each node will point to next node
        // Default Construstor

        Node(String data) {
            this.data = data; // value passed as an argument
            this.next = null; // each new node you will create will point to null //yeh call hoga jab bhi naya node create hoga
    
            size++;
        }
    }

// Add at the start of the linked list
    public void addFirst(String data) {
        Node newNode = new Node(data); 
        if (head == null) {// if there is no node present
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

// Add at the last of Linked list
    public void addLast(String data) {
        Node newNode = new Node(data); // if there is no node present
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next; // soo jabtk hum last node pr nhi pahuchengey tab tk iterate hota rhega next
        }
        currNode.next = newNode; // so last pr aatey he jo current node ka null h usko ab hamarey ne node ko
                                 // point krdengey and new node ka default pointing tho null hota he
                                 // h(Constructor)
    }

// Delete the node
    public void Deletefirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
    }

// Delete Last
    public void DeleteLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        if (head.next == null) { // agr sirf single node h tho ussey he delete krdengey
            head = null;
            return;
        }
        Node SecondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            SecondLast = SecondLast.next;
        }
        SecondLast.next = null;
    }

// Print the List
    public void PrintList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        BasicLinked list = new BasicLinked();
        list.addFirst("a");
        list.addFirst("is");
        list.PrintList();

        list.addLast("List");
        list.PrintList();

        list.addFirst("This");
        list.PrintList();

        list.DeleteLast();
        list.PrintList();
        list.Deletefirst();
        list.PrintList();
        System.out.println(list.getSize());
    }
}