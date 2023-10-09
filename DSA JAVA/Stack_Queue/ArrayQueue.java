package Stack_Queue;

public class ArrayQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear= -1;  //front ko define krne ki jhrurat nhi o hamesha 0 index se shuru hota h

        public Queue(int n){
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        //Enque
        public static void add(int data){
            if(rear==size-1){
                System.out.println("full queue");
                return;
            }
            rear++;
  
            arr[rear]=data;
        }
        //deque
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];   //1 place se shift krdiya
            }
            rear--;
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {

        Queue q =new Queue(4);
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);

        // while(!q.isEmpty()){
        //     System.out.println(q.peek());
        //     q.remove();
        // }
    }
}
