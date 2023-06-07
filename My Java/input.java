import java.util.Scanner;

public class input {
    public static void main(String[] args) {
    System.out.println("Taking input from the user");
    try (Scanner sc = new Scanner(System.in)) {

        System.out.println("Enter Number 1");
        boolean b1=sc.hasNextInt();
        System.out.println(b1);

        //int a =sc.nextInt();
        // float a=sc.nextFloat();
        // System.out.println("Enter Number 2");
        //int b=sc.nextInt();
        // float b=sc.nextFloat();
        // //int sum=a+b;
        // float sum=a+b;
        // System.out.println("The sum of the Number is : ");
        // System.out.println(sum);

        // String str= sc.next();
        // String str= sc.nextLine();
        // System.out.println(str);
    }
   } 
   

}
