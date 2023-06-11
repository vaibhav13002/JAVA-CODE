@FunctionalInterface
interface A{
    int Add(int i,int j);
}

public class LambdExp {
    public static void main(String[] args) {
    A obj=new A() {
        public int Add(int i,int j){
            return i+j;
        }
    };
    int result=obj.Add(5, 4);
    System.out.println(result);
}
}
