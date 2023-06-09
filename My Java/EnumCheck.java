enum Laptop{
    sony(200),Samsung(400),lenevo(500),apple(600),dell(700),hp(800);

    private int price;
private Laptop(int price){
    this.price=price;
}
public int getprice(){
    return price;
}
public void setprice(int price){
    this.price=price;
}

}


public class EnumCheck {
    public static void main(String[] args) {
        Laptop s=Laptop.lenevo;
        Laptop[] ss=Laptop.values();
        for(Laptop k:ss){
            System.out.println(k+":"+k.getprice());
        }
        // System.out.println(s);
    }
    
}
