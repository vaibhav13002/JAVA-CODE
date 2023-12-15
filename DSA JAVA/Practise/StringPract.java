package Practise;

import java.util.Arrays;
import java.util.StringTokenizer;

//Strings Immutable..we can not modify it
public class StringPract {
    public static void main(String[] args) {
        // String x="a";
        // String y="b";
        // String z=x+y;
        // System.out.println(z);

        String sent = "   My,name,is,Vaibhav,Mishra  ";
        System.out.println(sent.trim());
//split direct nhi work krega coz we need to store the output in the array nd that we have not created at any point
        String[] newS = sent.split(",");
        System.out.println(Arrays.toString(newS));

        StringTokenizer st= new StringTokenizer(sent);
        // while (st.hasMoreTokens()) {
            // System.out.println(st.nextToken());
        // }
        System.out.println(newS[1]);
//////////////////////////////////////////////////////////////////////////////
     String sent1= "India won The WorldCup 2023";
     System.out.println(sent1.indexOf("won"));   //this give index of first occurrence of char
        System.out.println(sent1.toLowerCase());
        System.out.println(sent1.substring(2, sent1.length()));

        System.out.println(sent1.replace("India", "Bega"));
        System.out.println(sent1.replace("o", "Bega"));
        System.out.println(sent1.startsWith("India w"));
///////////////////////////////////////////////////////////////////////////
            String[] sent2= {"vaibhav", "Mishra", "Bega", "Java"};

            System.out.println(sent2.length);

            String naam="Vaibhav";
            char[] c=naam.toCharArray();
            System.out.println(Arrays.toString(c));
            StringBuilder s1=new StringBuilder(naam).reverse();   // O(N) single for loop run ho rha h
            System.out.println(s1);
            String revs=s1.toString();
            System.out.println(revs);
    }
}
//https://www.youtube.com/watch?v=pmEvicdERg4