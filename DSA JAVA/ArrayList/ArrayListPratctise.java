package ArrayList;
import java.util.ArrayList;

public class ArrayListPratctise {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(51);arr1.add(25);arr1.add(100);arr1.add(5);
        arr1.add(57);arr1.add(88);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(51);arr.add(25);arr.add(68);arr.add(5);
        arr.add(57);arr.add(88);arr.add(31);
        System.out.println(arr);
        // arr.set(2, 100);
        // System.out.println(arr);
        // System.out.println(arr.clone());
        // System.out.println(arr.contains(55));
        // System.out.println(arr.equals(arr1));
        // Collections.sort(arr);
        // System.out.println("Sorted ascending: "+ arr);
        // Collections.sort(arr, Collections.reverseOrder());
        // System.out.println("Sorted in Descend: "+arr);

        for(int i=0;i<arr1.size();i++){
        System.out.println(Integer.valueOf(i));
        }
        

          

    }
}
