import java.net.SocketTimeoutException;
import java.util.Objects;

class Laptop{
    String brand;
    int price;
    
    
}
public class ThatKeyword {
    public static void main(String[] args) {
        Laptop obj=new Laptop();
        obj.brand="Lenevo";
        obj.price=500;

        System.out.println(obj.toString());
    }
}
