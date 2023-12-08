package ArrayList;
import java.io.*;


public class java{

public static int[] operation (int[] a, int n) { 
    for ( int i= 0; i + 1 < n ;i++){
    if(a[i] > a[i + 1]) {
    int temp = a[i] ;
    a[i] = a[i + 1] ;
    a[i + 1] = temp;

}
}

return a;

}

public static void main(String[] args) throws IOException{
    int[] a = new int[]{44, 51, 93, 77, 3, 84, 2, 21, 55, 20}; 
    a = operation (operation (operation(a, 10), 10), 10);
    for (int x : a)
      System.out.print ( x +" " );

}
}