package OOPS;

public class Car_abstract extends AbstractDemo {

    public Car_abstract(int age) {
        super(age);
        //TODO Auto-generated constructor stub
    }

    @Override
    void Engine(String name) {
        System.out.println("This is About Engine, "+name);
    }

    @Override
    void Color(String naam){
        System.out.println("This is about colour, "+naam);
    }

}
