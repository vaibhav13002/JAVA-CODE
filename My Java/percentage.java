import java.net.SocketTimeoutException;
import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        System.out.println("Enter Your Marks");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=((a+b+c+d)/400)*100;
        System.out.println("Your Percentage is : " +e);


    }
}
