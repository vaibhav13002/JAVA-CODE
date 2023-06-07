import java.util.Random;

import javax.sound.sampled.SourceDataLine;

public class Array {
    public static void main(String[] args) {
        int arry[][]=new int[3][4];
       
        // int arry[]={1,2,3,4};

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arry[i][j]=(int)(Math.random()*10);
        }}

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
            System.out.print(arry[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("_______");

    for(int n[]:arry)
    {
        for(int m:n)
        {
            System.out.print(m+" ");
        }
        System.out.println();
    }
        
    } 
}

