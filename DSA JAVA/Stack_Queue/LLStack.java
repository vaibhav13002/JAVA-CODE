package Stack_Queue;

public class LLStack {
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int val){
            Node newnode=new Node(val);
            if(isEmpty()){
                head=newnode;
                return;
            }
            newnode.next=head;  //addfirst
            head=newnode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
          //  head=head.next; //isey direct remove hojayega hum print nhi krepayengey
          int top=head.val;
          head=head.next;
          return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.val;            
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        Stack.push(1);
        Stack.push(2);  //s.push() bhi kr sktey h put static ka issue aarha h
        Stack.push(3);
        Stack.push(4);
        Stack.push(5);

        while(!Stack.isEmpty()){
            System.out.println(s);
            Stack.pop();
        }
        
    }
}
