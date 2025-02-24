package PractiseFeb25.ArrayPractF25;

import java.util.HashSet;

public class ValidSudoku36 {

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        // char[][] board = {
        //     {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
        //     {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
        //     {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
        //     {'2', '.', '.', '.', '6', '.', '.', '.', '3'},
        //     {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
        //     {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
        //     {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
        //     {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
        //     {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        // };
        
        
        
        // Check each row
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i)) {
                System.out.println("False");
                return;  // Exit immediately if any row is invalid, Siddha Main method return kr rha h so aagey kuch bhi implement nhi hoga
            }
        }

        // Check each column
        for (int i = 0; i < 9; i++) {
            if (!isValidColumn(board, i)) {
                System.out.println("False");
                return;  // Exit immediately if any column is invalid
            }
        }

        // Check each 3×3 sub-grid
        for (int i = 0; i < 9; i += 3) { // Iterate over 3x3 sub-grid rows
            for (int j = 0; j < 9; j += 3) { // Iterate over 3x3 sub-grid cols
                if (!isValidBox(board, i, j)) {
                    System.out.println("False");
                    return;  // Exit immediately if any 3x3 box is invalid
                }
            }
        }

        // If everything is valid
        System.out.println("True");
    }
    // Check if a row is valid

    public static boolean isValidRow(char[][] board, int row) {
        HashSet<Character> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            char num = board[row][i];
            if (num == '.') {
                continue;
            }
            if (seen.contains(num)) {
                return false;
            } else {
                seen.add(num);
            }
        }
        return true;
    }

    // Check if a column is valid
    public static boolean isValidColumn(char[][] board, int col) {
        HashSet<Character> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            char num = board[i][col];
            if (num == '.') {
                continue;
            }
            if (seen.contains(num)) {
                return false;
            } else {
                seen.add(num);
            }
        }
        return true;
    }

    // Check if a 3×3 box is valid
    public static boolean isValidBox(char[][] board, int row, int col) {
        HashSet<Character> seen = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char num = board[row + i][col + j];
                if (num == '.') {
                    continue;
                }
                if (seen.contains(num)) {
                    return false;
                } else {
                    seen.add(num);
                }
            }
        }
        return true;
    }
}
