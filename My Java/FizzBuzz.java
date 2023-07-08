import java.util.ArrayList;
class Solution{
    public ArrayList<String> FizzBuzz(int n){
        ArrayList<String> answer= new ArrayList<>();
        String check="";
        for(int i=1;i<=n;i++){
            if(i%3==0){
                check +="Fizz";
            }
            if(i%5==0){
                check +="Buzz";
            }
            if(check.isEmpty()){
                check +=String.valueOf(i);
            }
        }
        // for(String k : answer){
        //     return k;
        // }
        return answer;
    }
}
public class FizzBuzz {
    public static void main(String[] args) {
        Solution ref=new Solution();
        ref.FizzBuzz(15);
        
        
        
    }
}
