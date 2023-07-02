import java.util.Scanner;

public class FunctionCheck {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter your name");
       String name=sc.next();
       String showgreet=Greet(name);
       System.out.println(showgreet);

    }
    static String Greet(String name){
        String message="HELLO "+name;
        return message;
    }
}
