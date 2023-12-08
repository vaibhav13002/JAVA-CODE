package ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchString {
    public static void main(String[] args) {
        System.out.println("Enter char :");
        Scanner sc=new Scanner(System.in);

        String name="Vaibhav";
        char target=sc.next().charAt(0);
        System.out.println(CharSearch(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));

        for(int i=0;i<name.length();i++){
        //System.out.println(name.charAt(i)); //for each ki tarah ek ek ko pakdega
        
        }
        sc.close();  //baad me add hua h a
    }
    static boolean CharSearch(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        // for(int i=0;i<str.length();i++){
        //     if(target==str.charAt(i)){   //String ko convert krega char me
        //         return true;
        //     }
        // }
        return false;
    }
}
