package ArrayList;

public class MoveZeroesToFront {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 4 };
        moveZerosToStart(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToStart(int[] arr) {
        int n = arr.length;
        int index = n - 1;
        // 1 0 1 2 3 4
        // Step 1: Move non-zero elements to the end
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index] = arr[i];  // yaha jo non zero value h ussey copy kr rhe h jaha zero h , swap nhi kr rhe h , j/index pointer vahi tk ruk jayega jitne non zero ko humne copy kiya h  ab unhi element ko agle step me zero krna h
                index--;
            }
        }

        // Step 2: Fill remaining with zeros
        while (index >= 0) {
            arr[index] = 0;
            index--;
        }
    }
}
