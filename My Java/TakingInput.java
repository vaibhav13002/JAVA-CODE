import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakingInput {
    public static void main(String a[]) throws IOException{
        System.out.println("Enter a new Number");

        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(in);
        int num=Integer.parseInt(bf.readLine());
        System.out.println(num);  

}
}


