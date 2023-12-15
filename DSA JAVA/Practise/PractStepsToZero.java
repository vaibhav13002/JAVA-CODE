package Practise;
//////for both -ve nd =ve numbers
public class PractStepsToZero {
    public static void main(String[] args) {
        System.out.println(fact(-7));
    }
    public static int fact(int n){
       return helper(n,0);
       
    }
    public static int helper(int n, int s){
        if(n==0){
            return s;   //at the last iss method se jo return hoga vahi sout me print hoga
        }
        if(n >0){
            return helper(n-1, s+1);
        }
        return helper(n+1, s+1);
    }
}
