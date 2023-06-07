class Sun
{
    public void stationaryMy() {
        System.out.println("Youi Want a pen?");
    }
    public String Music(int a){
        return "Music is playing..";
    }
}
public class Obj2 {
    public static void main(String[] args) {
        Sun obj=new Sun();
    // obj.stationaryMy();
    String str =obj.Music(5);
    System.out.println(str);
    }
    
}


