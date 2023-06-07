import java.util.random.RandomGenerator;

public class loops_21 {
    public static void main(String[] args) {
        // int i=100;
        // while (i<=200) {
        //     System.out.println(i);
        //     i++;
        // };

//Do while loop---> first loop gets executes then condition is checked.        
        // int a= 0;
        // int n=10;
        // do{
        //     System.out.println(a);
        //     a++;
        //     System.out.println("vaibhav");
        // }while(a<=n);

//For loop
        // for(int i=1; i<=10; i++){
        //     System.out.println(i);
        // }

        // int n=5;
        // for(int i=0; i<5; i++){
        //     System.out.println(2*i+1);
        // }   
        
        // for(int i=5;i!=0;i--){
        //     System.out.println(i);
        // }

//Break
        for(int i=0;i<50;i++){
            // System.out.println(i);
            // System.out.println("India is my country");
        if(i==2){
            System.out.println("Ending the loop");
            continue;
        } 
        System.out.println(i);
        System.out.println("Australia is great");
     }
     System.out.println("America is also great");    

   
    }
}
