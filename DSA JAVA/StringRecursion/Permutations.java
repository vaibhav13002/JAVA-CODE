package StringRecursion;
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permutations("", "abc");

        ArrayList<String> ans = permutationsList("", "abc");
        System.out.println(ans);

        System.out.println(permutationsCount("", "abcd"));
    }
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i<=p.length();i++){
            String f=p.substring(0, i);
            String s=p.substring(i, p.length());
            permutations(f+ch+s, up.substring(1));
        }
    }
//To Store the answer in an ArrayList
    static ArrayList<String> permutationsList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<=p.length();i++){
            String f=p.substring(0, i);
            String s=p.substring(i, p.length());
            ans.addAll(permutationsList(f+ch+s, up.substring(1)));
        }
        return ans;
    }
//To count the number of solution is possible (3!=6, 4!=24 solutions)
 static int permutationsCount(String p, String up){
    int count = 0;
        if(up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        for(int i=0; i<=p.length();i++){
            String f=p.substring(0, i);
            String s=p.substring(i, p.length());
            count += permutationsCount(f+ch+s, up.substring(1));
        }
        return count;
    }
}
