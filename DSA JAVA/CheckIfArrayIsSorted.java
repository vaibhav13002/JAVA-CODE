public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr={4,5,2,6};
        System.out.println(arraySortedOrNot(arr, 4));
    }
    static boolean arraySortedOrNot(int[] arr, int n) {
        for(int i=0;i<n-1;i++){
                  if(arr[i]>arr[i+1]){
                      return false;
                  }
              }
              return true;
          }
}
