package ArrayList;
import java.util.ArrayList;

import java.util.Scanner;
public class Array2DList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        ArrayList<ArrayList> list=new ArrayList<>(2);

        //Initiliazing
        for(int i=0; i<5;i++){
            list.add(new ArrayList<>(5));
        }

    //Adding element
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                list.get(i).add(sc.nextInt());  //pehle array list pakdengey i pr nd usme fill krengey
            }
        }
        System.out.println(list);
        sc.close();
    }
}
