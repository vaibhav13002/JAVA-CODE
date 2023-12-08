package ArrayList;
import java.util.Arrays;

public class RotateBy1 {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] arr)
    {
        int i = 0, j = arr.length - 1;
        while (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    //jo start ka ek step me right me jayega o next step me vapas ayega jiske vajah se next wala right me chala jayega
}
