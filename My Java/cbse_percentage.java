import java.util.Scanner;

public class cbse_percentage {
    public static void main(String[] args) {
        System.out.println("Enter Your Marks here:- ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Subject 1 marks:- ");
        float a=sc.nextFloat();
        System.out.print("Subject 2 Marks:- ");
        float b=sc.nextFloat();
        System.out.print("subject 3 Marks:- ");
        float c=sc.nextFloat();
        System.out.print("Subject 4 Marks:- ");
        float d=sc.nextFloat();
        System.out.print("Subject 5 Marks:- ");
        float e=sc.nextFloat();

        float Toatalmarks=a+b+c+d+e;
        float z=Toatalmarks/500;
        float y=z*100;
        System.out.print("Your Percentage is :- " +y+"%");

    }
    
}
