import java.util.Scanner;

// import javax.annotation.processing.SupportedOptions;

public class PS_chpt4 {
    public static void main(String[] args) {
        // QUESTION NO: 2
        // String subject=("maths","science","english","hindi","history");
        // System.out.println("ENTER THE MARKS OF THE SUBJECT");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Maths: ");
        // double Maths=sc.nextDouble();
        // if (Maths>=33) {
        // }
        // else{
        // System.out.println("You are Fail");
        // }
        // System.out.println("Science: ");
        // double Science=sc.nextDouble();
        // if (Science>=33) {
        // }
        // else{
        // System.out.println("You are Fail");
        // }
        // System.out.println("English: ");
        // double English=sc.nextDouble();
        // if (English>=33) {
        // }
        // else{
        // System.out.println("You are Fail");
        // }
        // System.out.println("Hindi: ");
        // double Hindi=sc.nextDouble();
        // if (Hindi>=33) {
        // }
        // else{
        // System.out.println("You are Fail");
        // }
        // System.out.println("History: ");
        // double History=sc.nextDouble();
        // if (History>=33) {
        // }
        // else{
        // System.out.println("You are Fail");
        // }

        // double total1=((Maths+Hindi+Science+History+English)/500);
        // double total=total1*100;
        // System.out.println(total);
        // if (total>=40) {
        // System.out.println("Congratulation You made it! :"+total+"%");

        // }
        // else{
        // System.out.println("Sorry! You Couldn't made it");
        // }

        // QUESTION NO: 3
        // System.out.println("Enter Your Income: ");
        // float tax=0;
        // float income=sc.nextFloat();
        // if (income>2.5f) {
        // tax=tax+0;

        // }
        // else if(income>2.5f && income<5.0f){
        // tax=tax + 0.05f*(income-2.5f);
        // }
        // else if(income>5.0f && income<10.0f){
        // tax=tax + 0.05f*(5.0f-2.5f);
        // tax=tax+0.2f*(10.0f-5.0f);

        // }
        // else if(income>10.0f){
        // tax=tax+0.05f*(5.0f-2.5f);
        // tax=tax+0.2f*(10.0f-5.0f);
        // tax=tax+0.3f*(income-10.0f);

        // }
        // System.out.print(tax);


        //question 4

        // int day = sc.nextInt();
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        // }

        //question6
        System.out.println("Enter Your Website");

        String website=sc.next();

        if (website.endsWith(".com")) {
            System.out.println("This is commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is Organization Website");
        }
        else if(website.endsWith(".in"))
        System.out.println("This is an Indian Website");

    }
}
