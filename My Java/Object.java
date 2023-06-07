class age{
    public void findage(int age) {
        if (age<20) {
            System.out.println("You are under age");
        }
        else{
            System.out.println("You are good");
        }
        
    }
}
public class Object {
    public static void main(String[] args) {
        age checkage=new age();
        //int findage=22;
        checkage.findage(25);
        
    }
    
}


