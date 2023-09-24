import java.util.*;

public class StringMultiply {
    public static void main(String[] args) {
        String s = "abccbccba";
        // s=remove(s);
        System.out.println(remove(s));
    }
    static String remove(String s) {
        String s1 = "";
        while(s.length()!= s1.length()){
            s1 = s;
            s = rem(s);
        }
        return s;
        }
        
        
    public static String rem(String s){
   StringBuilder str = new StringBuilder();
  int n = s.length();
    int i =0;
  while(i<n){
      if(i<n-1 && s.charAt(i)==s.charAt(i+1)){
          while(i<n-1 && s.charAt(i)==s.charAt(i+1) ){
              i++;
          }
      }
      else{
          str.append(s.charAt(i));
      }
      i++;
  }
  return str.toString();
}
}
