package Recursion;
public class CountZeroRecur {
    public static void main(String[] args) {
        System.out.println(count(10204));
    //    System.out.println(Fact(10204)); 

    }
//     public static int Fact(int n){
//         int count =0;
//         if(n==0){
//             return count;
//         }
//         if(n%10==0){
//             count++;
//         }
//         return count + Fact(n/10);
// }
//using helper

        static int count(int n){
            return helper(n,0);
        }
        private static int helper(int n, int c){
            if(n==0){
                return c;
            }
            int rem=n%10;
            if(rem==0){
                return helper(n/10 , c+1);
            }
            else{
                return helper(n/10, c);
            }
        }
    }

