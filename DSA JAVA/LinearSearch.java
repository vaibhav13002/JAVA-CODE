import java.util.ArrayList;
import java.util.Arrays;
public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={1,32,45,22,66,43,-23,99};
        int target=455;
        int result=LinearSearch(nums, target);
        System.out.println(result);
        
    }
    //returning the element it self....remember to change the return type as -1 can be element also in th array
        static int LinearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        else{  //jab ek he else condition rhega tho nhi bi likhengey tho bhi chalega
            //enhance for loop
            for(int element : arr){
                if(element==target){
                    return element;
                }
            }
    //     for(int index=0;index<arr.length;index++){
    //     int element=arr[index];
    //     if(element==target){
    //         return element;
    //     }
    // }
    }
    return Integer.MAX_VALUE;
}

    //returning the index value
//     static int LinearSearch(int[] arr,int target){
//         if(arr.length==0){
//             return -1;
//         }
//         else{  //jab ek he else condition rhega tho nhi bi likhengey tho bhi chalega
//         for(int index=0;index<arr.length;index++){
//         int element=arr[index];
//         if(element==target){
//             return index;
//         }
//     }
// }
// return -1;
// }   
}
