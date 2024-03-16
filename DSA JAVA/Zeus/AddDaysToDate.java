package LeetGFG;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AddDaysToDate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input the initial date in DD/MM/YYYY format
        System.out.print("Enter the initial date (DD/MM/YYYY): ");
        String initialDateStr = scanner.nextLine(); // format add 16/03/2024

        // Input the number of days to add
        System.out.print("Enter the number of days to add: ");
        int daysToAdd = scanner.nextInt();

        // Parse the initial date string to LocalDate object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate initialDate = LocalDate.parse(initialDateStr, formatter);

        // Add days to the initial date
        LocalDate outputDate = initialDate.plusDays(daysToAdd);

        // Output the result
        System.out.println("Output date after adding " + daysToAdd + " days: " + outputDate.format(formatter));

        scanner.close();
    }
}
