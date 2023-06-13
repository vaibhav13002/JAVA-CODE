class A implements Runnable    // this is functional interface......A > Thread > Runnable > Run() method
{
    public void run(){
        for(int i=1; i<=5;i++){
        System.out.println("Hello WOrld");
    }} 
}
class B implements Runnable
{
    public void run(){
        for(int i=1; i<=5;i++){
        System.out.println("hi");
    }}
}  
public class Threading {
    public static void main(String[] args) {
        
        // A obj=new A();
        // B obj1=new B();
        // System.out.println(obj.getPriority());
        // System.out.println(obj1.getPriority());
        // Runnable obj =new Runnable() 
        // {
        // public void run(){
        // for(int i=1; i<=5;i++){
        // System.out.println("Hello WOrld");}}
        // };
       
        // Runnable obj1 =new Runnable() 
        // {
        //   public void run(){
        // for(int i=1; i<=5;i++){
        // System.out.println("hi");}}  
        // };
/////Now Trying the lambda method (reducing the code)
        //   Runnable obj =() -> 
        //   {for(int i=1; i<=5;i++){
        // System.out.println("Hello WOrld");}
        //   };
        // Runnable obj1 =() -> {
        //     for(int i=1; i<=5;i++){
        // System.out.println("hi");}
        //     };
        
        // Thread t1=new Thread(obj);   //run method pehle runnable me jayegfa then thread me then A me call hoga
        // Thread t2=new Thread(obj1);  //refrence of interface and object of class

        // t1.start();
        // t2.start();
    }
}
