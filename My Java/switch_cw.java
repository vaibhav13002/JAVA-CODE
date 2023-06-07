import java.util.Scanner;

public class switch_cw {
public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your age : ");
        age=sc.nextInt();
        switch (age) {
            case 10:
                System.out.println("You are not Adult");
                break;
             case 20:
                System.out.println("You Are Adult");   
                break;
             case 30:
                System.out.println("You Are going for job");   
                break;  
            default:
            System.out.println("Happy New Year");
                break;
                
        }
        System.out.println("JAI SHREE RAM");
        
    }
}
