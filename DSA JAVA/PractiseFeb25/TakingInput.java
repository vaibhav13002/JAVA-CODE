package PractiseFeb25;
import java.util.Scanner;

public class TakingInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int n2 = sc.nextInt();

        // int sum = n1+n2;
        // System.out.println("The Sum of first two numbers is: "+ sum);
        int sum = Add(n1,n2);
        System.out.println("The Sum of first two numbers is: "+ sum);
        
        
    }
// Adding the whole in to an Method  
    public static int Add(int a, int b){
        return a+b;
    }
}
//