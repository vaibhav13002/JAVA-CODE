class Calc{
    public void show(){
        System.out.println("in Calc");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
class AdvCalc extends Calc{
    public void show(){
        System.out.println("in AdvCalc");
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        
        AdvCalc obj=new AdvCalc();
        obj.add(5, 3);
        obj.show();

    }
}
