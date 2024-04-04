package Zeus;

import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        // int nRows = scanner.nextInt();
        int nRows = 4;

        for (int i = 0; i < nRows; i++) { // har ek iteration me ek row build kr rha h
            for (int j = 0; j < nRows - i - 1; j++) {  // prints 0 char before 1 in each row
                System.out.print("0");
            }
            // for (int k = nRows - i - 1; k < nRows; k++) {  // nRows - i - 1 is used to find start index from where 1 is should be printed
            //     System.out.print("1");
            // }
            for (int l = 0; l < i+1; l++) {  // issey bhi 1 print kr sktey j
                System.out.print("1");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("1");
            }
            for (int m = 0; m < nRows - i - 1; m++) {
                System.out.print("0");
            }
            System.out.println();
        }
        scanner.close();
    }
}
