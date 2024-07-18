package IB;

public class PassingArgument {
    public static void main(String[] args) {
        int n =5;
        System.out.println(n);
        Update(n);
        System.out.println(n);
        update1(n);
        System.out.println(n);
        System.out.println(update1(n));  //hum uss copy wale instance ko print kr rhe h

    }
    public static void Update(int n){
        n=10;
    }
    public static int update1(int n){
        n=15;
        return n;
    }
}

/*
1.Pass by Value:

In pass by value, a copy of the value of the argument is passed to the function. The function receives a copy of the data, not the original data itself. This means that any changes made to the parameter inside the function do not affect the original argument in the calling code.
Key points:

The function receives a copy of the value.
Changes to the parameter inside the function do not affect the original argument.
It's memory inefficient for large data structures, as a copy is made.
 */
/*
2 Pass by Reference:

In pass by reference, a reference to the actual argument (its memory address) is passed to the function. This means the function can directly access and modify the original data.
Key points:

The function receives a reference (address) to the original data.
Changes to the parameter inside the function affect the original argument.
It's memory efficient as no copy of the data is made.
 */
// Java does not have true pass-by-reference semantics. Java always uses pass-by-value, even for objects.
