class OuterClass
{
    int y=10;
    class InnerClass
    {
        int x=5;
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass obj1=new OuterClass();
        OuterClass.InnerClass obj2=obj1.new InnerClass();
        System.out.println( obj1.y +" "+obj2.x);
        
        
    }   
}
