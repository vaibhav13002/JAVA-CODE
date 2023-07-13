class Add{
    int a;
    int b;
    public void Values(){
        a=10;
        b=20;
    }
}
class Calculate extends Add{
    public void Calc(){
        int c=a+b;
        System.out.println(c);
    }
}
public class InheriSingle {
    public static void main(String[] args) {
        Calculate obj=new Calculate();
        obj.Values();    // a nhi karengey tho o Add class ke method ko access nhi krega bas uskey andar ka ina a nd b krega jo ki empty h
        obj.Calc();
    
    }
}
