package BinarySearch;
public class CeilingBinarySearch {
    public static void main(String[] args) {
        int[] arr={-4,1,28,58,95};

        System.out.println(arr.length);
        int target=60;
        int ans=binarysearch(arr, target);
        System.out.println(ans);   
    }
    static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start <= end){
            int mid=start+(end-start)/2;
            if(target>arr[arr.length-1]){  //check ki agar last value se bada h no. jo hum dhund rhe h tho -1 return kro
                return -1;
            }
            if(target < arr[mid]){    //yaha value compare horha h coz array is sorted
                end=mid-1;
            }
            else if(target > arr[mid]){
                start=mid +1;
            }
            else{
                return mid; 
            }
        }
        return arr[start];   //yaha loop break ho rha h jab loop ekdum chota ho jarha h mtlb start and end ek jagah point kr rhe h just uske baad dono 
    }                        //interchange ho rhe h so start target se just ek bada no. pr ja kr rukk rha h vahi tho chayeh hume
                            // And End Target se ek small no. pr ruk rha h, (Floor of the Target)
}
