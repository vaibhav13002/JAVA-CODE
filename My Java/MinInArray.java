public class MinInArray {
    public static void main(String[] args) {
        int[] arr={11,34,22,54,-4,23,-9,4,6};
        System.out.println(Find(arr));

    }
    static int Find(int[] num){
        int min=num[0];
        for(int i=1;i<num.length;i++){
            if(min>num[i]){
                min=num[i];
            }
        
        }
        return min;
    }
}
