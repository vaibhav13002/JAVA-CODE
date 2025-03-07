package Stack_Queue;

import java.util.Stack;

public class ValidParenthese20 {
    public static void main(String[] arge){
        String s = "([])";
        System.out.println(ValidParentheses(s));
    }
    public static boolean ValidParentheses(String s){
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c== '(' || c== '[' || c=='{'){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return true;
                }
                char top = st.peek();
                if(c== ')' && top=='(' || c== ']' && top=='[' || c=='}' && top=='{'){
                    st.pop();
                }
                return st.isEmpty();
            }
        }
        return false;
    }
}
