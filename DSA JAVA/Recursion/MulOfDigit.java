package Recursion;
public class MulOfDigit {
    public static void main(String[] args) {
        System.out.println(Fact(142));
    }
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        // return n* Fact(n-1);
        //sum
        return (n%10)* Fact(n/10);
    }
}
