class Mobile{
    int price;
    String name;
    static String type;

    public void show()
    {
        System.out.println(name+":"+price+":"+type);
    }
}
public class StaticKey {
    public static void main(String[] args) {
     
        
        Mobile obj1=new Mobile();
        obj1.price=500;
        obj1.name="Apple";
        obj1.type="Smartphone";

        Mobile obj2=new Mobile();
        obj2.price=800;
        obj2.name="Samsung";
        obj2.type="Smartphone";

        obj1.type="phone"; 
        obj1.show();
        obj2.show();
        
    }
}
