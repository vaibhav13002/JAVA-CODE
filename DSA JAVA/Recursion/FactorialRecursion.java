package Recursion;
public class FactorialRecursion {
    public static void main(String[] args) {
        // Fact(5);
        System.out.println(Fact(5));
    }
    public static int Fact(int n){
        if(n<=1){
            return 1;
        }
        // return n* Fact(n-1);
        //sum
        return n+ Fact(n-1);
    }
}
