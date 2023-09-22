import java.util.StringTokenizer;

public class StringTokenizer1 {
    public static void main(String[] args) {
        String s="My Name is Vaibhav Mishra";
        StringTokenizer st = new StringTokenizer(s);   

        System.out.println(st.countTokens()); //it will count number of words
        while (st.hasMoreTokens()) {  
            System.out.println(st.nextToken()); 
           
        }
         
    }
}
