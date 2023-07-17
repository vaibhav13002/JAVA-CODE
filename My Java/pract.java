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
    public void Dev(Computer lap){ //iska mtlb dev need computer to code nichey lap obj Laptop() method ko point kr rha h so o run hoga Computer class bas ref derha h ki usi ka bacha h o
        lap.code();  //obj.method
    }
}
public class pract {
    public static void main(String[] args) {
        Computer dek= new Desktop();
        Computer lap = new Laptop(); //we can create ref of parent class and constructor of child class
        Devloper devops =new Devloper();
        devops.Dev(dek);
        devops.Dev(lap);
    }
    
}
