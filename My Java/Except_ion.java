
class VaibhavException extends Exception{
    public VaibhavException(String string){
        super(string);
    }
}
public class Except_ion {
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try {
            j=15/i;
            // float f=i;
            if(j == 0)  // for creating ur exception create the class of it nd call it...also extend ur class to exception class to gets all of its feature.
            throw new VaibhavException("India is my Country");   // create ur own exception and catch also ur exception
            
        } catch (VaibhavException e) {
            System.out.println("There is an error in the code"+e);
        }
        finally{
        System.out.println("Sunday! The king plays");
    }
System.out.println(j);}
}


