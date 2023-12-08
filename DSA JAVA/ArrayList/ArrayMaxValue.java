package ArrayList;
public class ArrayMaxValue {
    public static void main(String[] args) {
        int[] arr={11,34,22,54,21};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maxvalue=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
            }
        }
        return maxvalue;
    }
}
