public class ReverseNumRecur {
    static int sum=0; //both should be static to access
    static void rev(int n){
        if(n==0){
            return;
    }
    int rem=n%10;
    sum=sum*10+rem;
    rev(n/10);
}

//Sometimes we need some additional variables in the argument
// in that case make another function //helper function

static int rev1(int n){  //this is our main method jisme hume ek helper function ko call kr rhe h
    int digits=(int)(Math.log10(n)+1);
    return helper(n, digits);
} 
    static int helper(int n, int digits) { //this is our helper function
        if(n%10==n){ //if single element is there return that element
            return n;
        }
        int rem=n%10;
        return rem * (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
}   


//To check Palindrome number
    static boolean palind(int n){
        return n==rev1(n);
    }


    public static void main(String[] args) {
        // rev(1542);
        // System.out.println(sum);
        System.out.println(palind(1234321));
    }
}

