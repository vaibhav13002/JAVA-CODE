package HashSet;

import java.util.*;

public class MajorityElement {
    public static void addHash(int[] arr){
        HashMap<Integer, Integer> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(int max : map.keySet()){
            if(map.get(max)>n/3){
                System.out.println(max);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,2,3,1,4,5};  
        addHash(arr);
    }
}
