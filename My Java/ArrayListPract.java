import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListPract {
    public static void main(String[] args) {
        System.out.println("Enter the No's:_ ");
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(5);
 
        for(int i=0;i<7;i++){
            list.add(in.nextInt());
        }

        //printing
        // System.out.println("Output :" +list.get(2));
         for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
    }
}
