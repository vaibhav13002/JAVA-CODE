package Stack_Queue;

import java.util.ArrayList;

public class ArrayListStack {
    static class stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        //push
        public static void push(int val){
            list.add(val);
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top; 
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }            
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        // stack s=new stack();
        stack.push(1);
        stack.push(2);  //s.push() bhi kr sktey h put static ka issue aarha h
        stack.push(3);
        stack.push(4);
        stack.push(5);       
        while(!stack.isEmpty()){
            System.out.print(stack.peek()+"->");
            stack.pop();
        }
    }
}
