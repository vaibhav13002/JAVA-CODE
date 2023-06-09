abstract class Computer{
    public abstract void code();
} 
class Laptop extends Computer{
        public void code(){
            System.out.println("code, compile,run");
        }
}
class Desktop extends Computer{
    public void code(){
        System.out.println("code, compile,run : faster");
    }
}
class Devloper{
    public void Dev(Computer lap){
        lap.code();
    }
}
public class pract {
    public static void main(String[] args) {
        Computer dek= new Desktop();
        Computer lap = new Laptop();
        Devloper devops =new Devloper();
        devops.Dev(dek);
        devops.Dev(lap);
    }
    
}
