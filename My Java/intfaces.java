interface A{
    int sum();
    int diff();
}
class B implements A{
    public void sum(int a,int b){
        System.out.println(a+b);
    }
    public void diff(int a,int b){
        System.out.println(a-b);
    }
    // public int sum(int a,int b){
    //     return a+b;
    // }
    // @Override
    // public int diff(int a,int b){
    //     return a-b;
    // }
}
     
public class intfaces {
    public static void main(String[] args){

        B obj= new B();
        int result=obj.sum(5, 2);
        System.out.println(result);
        int result1=obj.diff(5, 2);
        System.out.println(result1);
    }
}
