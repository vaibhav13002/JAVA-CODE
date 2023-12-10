import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Array2DList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        ArrayList<ArrayList<Integer>> list=new ArrayList<>(2);

        //Initiliazing // 2D banane ke liye krna par rha h andar box bana rhe h java pr filling hoga
        for(int i=0; i<5;i++){
            list.add(new ArrayList<>(5));
        }

    //Adding element
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                list.get(i).add(j);  //pehle array list pakdengey i pr nd usme fill krengey
            }
        }
        list.add(new ArrayList<>(Arrays.asList(7,7,7,7,7))); //Direct adding into the arraylist
        list.get(2).add(555); //second row ke last me add
        list.get(3).add(4, 999);  //first list uss index pr jayega then in that list at that index it will add 
        System.out.println(list);
        sc.close();
    }
}
