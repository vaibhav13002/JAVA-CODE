package Zeus;

import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        // int nRows = scanner.nextInt();
        int nRows = 4;

        // for (int i = 0; i < nRows; i++) { // har ek iteration me ek row build kr rha h
        //     for (int j = 0; j < nRows - i - 1; j++) {  // prints 0 char before 1 in each row
        //         System.out.print("0");
        //     }
        //     // for (int k = nRows - i - 1; k < nRows; k++) {  // nRows - i - 1 is used to find start index from where 1 is should be printed
        //     //     System.out.print("1");
        //     // }
        //     for (int l = 0; l < i+1; l++) {  // issey bhi 1 print kr sktey j // row me loop chal rha h i=0 h next me tho koi 1 nhi ayega
        //         System.out.print("1");
        //     }
        //     for (int l = 0; l < i; l++) { // 2nd row se print karega 1st iteration me loop he nhi chalega kyuki start end loop ka 0 h
        //         System.out.print("1");
        //     }
        //     for (int m = 0; m < nRows - i - 1; m++) {
        //         System.out.print("0");
        //     }
        //     System.out.println();
        // }


                // Loop for each row
                for (int i = 0; i < nRows; i++) {
                    // Print leading zeros
                    for (int j = 0; j < nRows - i - 1; j++) {
                        System.out.print("0");
                    }
                    // Print ones
                    for (int k = 0; k < 2 * i + 1; k++) {
                        System.out.print("1");
                    }
                    // Print trailing zeros
                    for (int l = 0; l < nRows - i - 1; l++) {
                        System.out.print("0");
                    }
                    System.out.println();
                }
        scanner.close();
    }
}
