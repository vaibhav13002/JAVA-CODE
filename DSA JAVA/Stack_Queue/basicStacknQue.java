package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class basicStacknQue {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // System.out.println(st);
        // st.pop();
        // System.out.println(st);

        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue);
        System.out.println(queue.contains(3));
        System.out.println(queue.remove());
    }
}
