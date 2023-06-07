class A{
    public A()
    {
        super();
        System.out.println("in A");
    }
    public A(int n)
    {
        super();
        System.out.println("int A");
    }
}
class B extends A{
    public B()
    {
        super();
        System.out.println("String B");
    }
    public B(String s)
    {
        super();
        System.out.println("in B");
    }
    public B(int n)
    {
        // super(n);
        this();              //it will call same class default constructor and super();
        System.out.println("int B");
    }
}

public class Constru {
    public static void main(String[] args) {
        B ref=new B(5);
        
    }
}
