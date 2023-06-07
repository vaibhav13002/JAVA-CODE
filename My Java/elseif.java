import java.util.Scanner;

public class elseif {
public static void main(String[] args) {
    System.out.println("Enter Your age");
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    if (age>65) {
        System.out.println("Your are Senior citizen"); 
    }
    else if(age>= 50){
        System.out.println("Your are Semi senior citizen");
    }
    else if(age>=18){
        System.out.println("You are an Adult");
    }
    else if(age>= 10){
        System.out.println("You are a baby");
    }
    else{
        System.out.println("you are god");
    }
    if (age>=8) {
        System.out.println("You can Drive");
        
    }

}    
}
