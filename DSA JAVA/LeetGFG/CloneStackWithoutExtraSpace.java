package LeetGFG;
//https://www.geeksforgeeks.org/problems/clone-a-stack-without-usinig-extra-space/0
import java.util.Stack;

public class CloneStackWithoutExtraSpace {
    public static void main(String[] args) {
        Stack<Integer> originalStack = new Stack<>();
        originalStack.push(1);
        originalStack.push(2);
        originalStack.push(3);

        Stack<Integer> clonedStack = new Stack<>();
        clonestack(originalStack, clonedStack);

        // Print the cloned stack
        while (!clonedStack.isEmpty()) {
            System.out.print(clonedStack.pop() + " ");
        }
    }
    static void clonestack(Stack<Integer> st, Stack<Integer> cloned) {
       if(st.size()==0){
           return;
       }
       int t=st.peek();
       st.pop();
       clonestack(st,cloned);   // draw recursion tree call
       cloned.push(t);
    }
}
// for loop ya while loop ue krtey tho extra space use hota since we need tho declare space to store inside function 