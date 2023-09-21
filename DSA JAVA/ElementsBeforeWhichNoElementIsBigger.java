public class ElementsBeforeWhichNoElementIsBigger {
    public static void main(String[] args) {
      long arr[] =  {10, 40, 23, 35, 50, 7};
      System.out.println(countElements(arr, 6));
    }
    static long countElements(long arr[], long n) 
    {
        long maxUntilNow=arr[0];
        long count=1;
        for(int i=1;i<(int)n;i++){
            if(arr[i]>maxUntilNow){
                count++;
                maxUntilNow=arr[i];
            }
        }
        return count;
    }
}
