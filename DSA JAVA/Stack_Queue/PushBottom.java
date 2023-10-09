package Stack_Queue;

import java.util.Stack;

public class PushBottom {
    public static void push(int val, Stack<Integer> st){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int top=st.pop();  //jis top ko nikal rhe h usi ko nichey push krengey
        push(val, st);
        st.push(top);
    }
public static void reverse(Stack<Integer> st){
    if(st.isEmpty()){
        return;
    }
    int top=st.pop();
    reverse(st);  //remove normally
    push(top, st);  //vapis push bottom pr krengey sabko
}
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // push(5, st);
        reverse(st);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
