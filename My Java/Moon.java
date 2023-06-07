class Sun{
    static int plusMethodInt(int x, int y) {
    return x + y;
  }
  
  static double plusMethodDouble(double x, double y) {
    return x + y;
  }
}
  
public class Moon{  
public static void main(String[] args) {


    Sun obj=new Sun();  
    int myNum1 = obj.plusMethodInt(8, 5);
    double myNum2 = obj.plusMethodDouble(4.3, 6.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
  }
}