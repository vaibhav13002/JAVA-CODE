

class Calc{
    public int Add(int n1,int n2){
        return n1+n2;
    }
}
class AdvCalc extends Calc{
    public int Mul(int n1,int n2){
        return n1*n2;
    }
    public int Add(int n1,int n2){
        return n1+n2+1;
}
}
public class MethodOveriding {
    public static void main(String[] args) {
        AdvCalc ref=new AdvCalc();
        int r1=ref.Mul(5, 4);
        int r2=ref.Add(4, 4);
        System.out.println(r1);
        System.out.println(r2);
        
    }
    
}
