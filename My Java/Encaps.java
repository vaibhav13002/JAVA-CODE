class A{
    private int age;
    private String name;


    public A()
    {
        age=256;
        name="Ray";
    }
    public A(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

    public int getage()
    {
        return age;
    }
    public String getname()
    {
        return name;
    }
    // public void setage(int age)
    // {
    //     this.age=age;
    // }
    // public void setname(String name)
    // {
    //     this.name=name;
    // }
}
public class Encaps {
    public static void main(String[] args) {
        
        A ref=new A();
        A ref1=new A(45,"Kai");
        // ref.name="vaibhav";
        // ref.setname("Bega");
        // ref.setage(21);
        System.out.println(ref.getname()+":"+ref.getage());
        System.out.println(ref1.getname()+":"+ref1.getage());
    }
}








