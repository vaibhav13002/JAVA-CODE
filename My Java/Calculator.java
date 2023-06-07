import java.rmi.server.Operation;

public class Calculator
 {
    public static void main(String[] args) {
        Operations obj= new Operations();
        int r1=obj.add(2, 5);
        int r2=obj.sub(5,2);

        System.out.println(r1+":"+r2);
    }    
}
