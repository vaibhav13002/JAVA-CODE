package Practise;

import java.util.Arrays;

public class RecurPractise {
    public static void main(String[] args) {
        int a=2758;
        System.out.println(Arrays.toString(Fact(a)));
    
        // System.out.println(a/10);
        // System.out.println(a%10);
    }
    public static int[] Fact(int n){
        int[] list = new int[2];
        if(n%10==0){
            return list;
        }
    
        int digit = n % 10;
        int[] subResults = Fact(n / 10);

        list[0] = digit + subResults[0];
        list[1] = digit * subResults[1];
     


        return list;
        // return (n%10)+ Fact(n/10);
        // return (n%10)* Fact(n/10);  //this is showing code is unreachable why??
    }
}

// n%10 -> last digit dega 
// n/10 -> last digit ko uda dega 