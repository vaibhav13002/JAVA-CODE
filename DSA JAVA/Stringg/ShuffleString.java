package Stringg;
public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,1,2,3};
        System.out.println(restoreString(s, indices));
    }
    public static String restoreString(String s, int[] indices) {
        StringBuilder string=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            string.setCharAt(indices[i],s.charAt(i));
        }
        return String.valueOf(string);
    }
}
