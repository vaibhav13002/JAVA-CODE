class Counter{
    int count;
    public synchronized void Increment(){
        count++;
    }
}

public class ThreadPract {
    public static void main(String[] args) {
       Counter c=new Counter();
       Runnable obj =() -> 
       {
        for(int i=1; i<=500;i++)
        {
            c.Increment(); 
        }};
       
        Runnable obj1 =() -> 
        {
        for(int i=1; i<=500;i++)
        {
            c.Increment();
        }};

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);

        t1.start();
        t2.start();
        // t1.join();  //for this we have to declare exception
        // t2.join();
        System.out.println(c.count);
        }
    }

    

