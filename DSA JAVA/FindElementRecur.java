public class FindElementRecur {
    public static void main(String[] args) {
        int[] arr={1,2,14,3,25};
        int target=14;
        System.out.println(find(arr, target, 0));
        System.out.println(PrintIndex(arr, target, 0));
    }
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
}
