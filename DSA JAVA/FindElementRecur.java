import java.util.ArrayList;

public class FindElementRecur {
    public static void main(String[] args) {
        int[] arr={1,2,14,14,3,25};
        int target=14;
        // System.out.println(find(arr, target, 0));
        // System.out.println(PrintIndex(arr, target, 0));

        // PrintIndex1(arr, target, 0);
        // System.out.println(list);


        
        System.out.println(PrintIndex2(arr, target, 0, new ArrayList<Integer>()));
    }
    //Normal code for to check if there or not
    public static boolean find(int[] arr, int target, int index){
        if(target==arr.length-1){
            return true;
        }
        if(index==arr.length){ //base case
            return false;
        }
        if(target==arr[index]){
            return true;
        }
        else{
        return find(arr, target, index+1);
        }
        // return arr[index]==target || find(arr, target, index+1);
        // return target==arr[index] || find(arr, target, index+1);
    }
// To print index value
   public static int PrintIndex(int[] arr, int target, int index){
        if(target==arr.length-1){
            return index;
        }
        if(index==arr.length){ //base case
            return -1;
        }
        if(target==arr[index]){
            return index;
        }
        else{
        return PrintIndex(arr, target, index+1);
        }
}

//for multiple same target we can use arraylist
static ArrayList<Integer> list= new ArrayList<>();
public static void PrintIndex1(int[] arr, int target, int index){
        if(target==arr.length-1){
            list.add(index);
        }
        if(index==arr.length){ //base case
            return;
        }
        if(target==arr[index]){
            list.add(index);
        }
        PrintIndex1(arr, target, index+1);
}
//Defining Arraylist in the function so that it is available for that function
 static ArrayList<Integer> PrintIndex2(int[] arr, int target, int index, ArrayList<Integer> list1){
        if(target==arr.length-1){
            list1.add(index);
        }
        if(index==arr.length){ //base case
            return list1;
        }
        if(target==arr[index]){
            list1.add(index);
        }
        return PrintIndex2(arr, target, index+1, list1);
}

}
