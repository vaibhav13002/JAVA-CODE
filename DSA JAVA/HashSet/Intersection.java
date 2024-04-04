package HashSet;

import java.util.*;


public class Intersection {
    public static String Inter(int[] arr1, int[] arr2){
        HashSet<Integer> map=new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int count =0;
        for(int i=0;i<arr1.length;i++){
            map.add(arr1[i]);
            
        }
        for(int j=0;j<arr2.length;j++){
            if(map.contains(arr2[j])){
            count++;
            list.add(arr2[j]);
            map.remove(arr2[j]);
            }
        }
        

        return count +" & " + list;

    }
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={1,2,3,4,5,6};
        System.out.println(Inter(arr1, arr2));
    }
}
