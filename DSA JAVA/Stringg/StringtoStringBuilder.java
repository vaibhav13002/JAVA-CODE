package Stringg;
import java.util.Arrays;

public class StringtoStringBuilder {
    public static void main(String[] args) {
        String s="Vaibhav";

        char[] arr=new char[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.charAt(i);
        }
        System.out.println(Arrays.toString(arr));




        // StringBUilder sb = new StringBUilder();
        // for(int i=0; i<s.length();i++){
        //     sb.append(arr[i]);
        // }
    }
}
