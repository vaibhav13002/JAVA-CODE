interface A{
    void sum();
    void diff();
}
class B implements A{
    public void sum(int a,int b){
        System.out.println(a+b);
    }
}
     
public class intfaces {
    public static void main(String[] args){

        A obj= new B();
        obj.sum(5, 2);
    }
}
