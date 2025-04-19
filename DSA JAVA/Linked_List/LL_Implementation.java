package Linked_List;

// public class LL_Implementation {
    
// }

// Singly Linked List in Java
class LL_Implementation {
    
    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Head of the list
    Node head;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Delete a node by value
    public void delete(int key) {
        Node current = head, prev = null;

        // If head node holds the key
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        // Search for the key
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If key not found
        if (current == null) {
            System.out.println("Value " + key + " not found in the list.");
            return;
        }

        // Unlink the node
        prev.next = current.next;
    }

    // Display the list
    public void display() {
        Node current = head;

        if (current == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method with example
    public static void main(String[] args) {
        LL_Implementation list = new LL_Implementation();

        // Inserting nodes
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display(); // Linked List: 10 -> 20 -> 30 -> 40 -> null

        // Deleting a node
        list.delete(20);
        list.display(); // Linked List: 10 -> 30 -> 40 -> null

        // Deleting a node not in the list
        list.delete(100); // Value 100 not found in the list.

        // Final state of the list
        list.display(); // Linked List: 10 -> 30 -> 40 -> null
    }
}
