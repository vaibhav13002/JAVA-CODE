package Pattern_Recursion;
public class TriangleUsingRecur {
    public static void main(String[] args) {
        // triangle(4, 0);
        Normaltriangle(4, 0);
    }
        static void Normaltriangle(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            Normaltriangle(r, c+1);
            System.out.print("*");
        }
        else{
            Normaltriangle(r-1, 0); //col 0 se vapis start
            System.out.println(); //new line me jayega
        }
    }

    static void triangle(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            triangle(r, c+1);
        }
        else{
            System.out.println(); //new line me jayega
            triangle(r-1, 0); //col 0 se vapis start
        }
    }
}


// The code is designed to print the right-angled triangle from top to bottom. Each recursive call handles one row of the triangle, starting from the top row and progressing to the bottom row. The asterisks within a row are printed from left to right.

// Here's a step-by-step breakdown of how the code works in terms of printing direction and recursive calls:

// Initially, you call the Normaltriangle function with the initial values of r (number of rows) and c (current column) as arguments. For example, if you call Normaltriangle(5, 0):

// r is 5 (number of rows).
// c is 0 (current column).
// Inside the function, the base case is checked first: if(r==0). Since r is initially 5 (in this example), it's not equal to 0, so the base case is not met, and the function proceeds.

// The next condition is checked: if(c < r). Initially, c is 0, and r is 5. Since 0 is less than 5, this condition is true, and the function takes the first branch:

// It calls Normaltriangle recursively with the same r (5) and the next column c+1. So, the next recursive call will be Normaltriangle(5, 1).
// After making the recursive call, it immediately prints an asterisk using System.out.print("*"). So, in the current row (row 5, column 0), an asterisk is printed.

// The function then continues to execute the same logic for the next column (c is incremented to 1). It checks if(c < r) again, and since 1 is still less than 5, it makes another recursive call: Normaltriangle(5, 2).

// It again prints an asterisk for the current column, so now two asterisks are printed in row 5.

// This process continues until c becomes equal to r (in this example, it will go up to c=4, as r is 5). When c equals r, the condition if(c < r) becomes false.

// At this point, the else block is executed:

// r is decremented by 1, so it becomes 4.
// c is reset to 0.
// A newline character is printed using System.out.println(). This moves to the next line to start a new row (row 4).

// The function then continues with the new values of r (4) and c (0), and the process repeats for the new row until c equals r again.

// This process repeats until r becomes 0. At that point, the base case is met, and the recursion starts to unwind from the top row to the bottom row.

// So, to clarify, the code is designed to print the triangle from the top row to the bottom row, and it uses recursion to handle each row and the columns within each row.
