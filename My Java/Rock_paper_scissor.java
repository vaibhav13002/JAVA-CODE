import java.util.Random;
import java.util.Scanner;


public class Rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println(RandomGenerator);
        String Rock="r";
        String Scissor="s";
        String Paper="p";
        String inp=sc.nextLine();

        if (r && r) {
            System.out.println("tie");  
        }
        else if (s && s){
            System.out.println("tie");
        }
        else if (p && p){
            System.out.println("tie");
        }
        else if (r && p){
            System.out.println("p wins");
        }
        else if (r && s){
            System.out.println("r wins");
        }
        else if (p && s){
            System.out.println("s wins");
        }
        else if (p && r){
            System.out.println("p wins");
        }
        else if (s && r){
            System.out.println("r wins");
        }
        else if (s && p){
            System.out.println("s wins");
        }

        

    }
}
