class Amount{
    int amount=0;
    public void Amount(){
        amount++;
    }
}
public class ThreadPract {
    public static void main(String[] args) {
        Amount obj=new Amount();
        for(int i=0;i<=5;i++){
        obj.Amount();
        }
    }
    
}
