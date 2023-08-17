public class InsertionSort {
    public static void Print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={8,4,7,2,9,1,0};

        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current <arr[j]) { //j ko itna bhi push krdena ki -ve me chala jaye
                    //unsorted part me jabtk current element chota rhega tab tk uskey liye jkagah banega sorted me
                arr[j+1]=arr[j];
                j--;      
            }  
            arr[j+1]=current;
        }
        Print(arr); //print
    }
}
