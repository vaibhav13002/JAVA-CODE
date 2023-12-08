package Recursion;
public class SumOfDigitsRecur {
    public static void main(String[] args) {
        System.out.println(Fact(2034));
    }
    public static int Fact(int n){
        if(n==0){
            return 0;
        }
        // return n* Fact(n-1);
        //sum
        return (n%10)+ Fact(n/10);
    }
}

