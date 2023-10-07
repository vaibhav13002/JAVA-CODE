public class RecursionS {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        // fun(5);
    }
        public static int sum(int k) {
          if (k > 0) {
            return k + sum(k - 1);
          } else {
            return 0;
          }
        }
    // public static void fun(int n){
    //     if(n==0){
    //         return;
    //     } 
    //     System.out.println(n); //pehle print hoga then fibo next ko call krega
        // fun(n-1);
        // System.out.println(n); //pehle next ko call krega then print iss hisab se fibo(1) pehle print hoga
    // }
}
