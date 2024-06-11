package OOPS.Abstraction;

public abstract class AbstractDemo {
    int age;
    public AbstractDemo(int age){
        this.age=age;
    }
    abstract void Engine(String name);
    abstract void Color(String naam);
    public void Animal(){
        System.out.println("Hello im Lion");
    }

    public static void main(String[] args) {
        // AbstractDemo obj = new AbstractDemo();
    }
}
