package LeetGFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortestUncommanString {
    public static void main(String[] args) {
        String[] arr={"cab","ad","bad","c"};
        System.out.println(Arrays.toString(shortestSubstrings(arr)));
    }
        public static String[] shortestSubstrings(String[] arr) {
            int len=arr.length;
            String result[]=new String[arr.length];
            Arrays.fill(result,"");
            
            for(int a=0;a<len;a++)
            {
                
                String str=arr[a];
                int N=str.length();
                for(int x=1;x<=N;x++)
                {
                    List<String> list=new ArrayList<>();
                    for(int y=0;y<N-x+1;y++)
                    {
                        String sub=str.substring(y,x+y);
                        if(check(arr,sub))
                        {
                            list.add(sub);
                        }
                    }
                    if(!list.isEmpty())
                    {
                        result[a]=findShortestString(list);
                        break;
                    }
                }
                
            }
            return result;
        }
        
        public static boolean check(String arr[],String str)
        {
            int count=0;
            for(int x=0;x<arr.length;x++)
            {
                if(arr[x].indexOf(str)>=0) count++;
            }
            return count==1;
        }
        
        public static String findShortestString(List<String> strings) {
            if (strings == null || strings.isEmpty()) {
                return null; // Handle edge case: empty list
            }
    
            String shortest = strings.get(0); // Assume the first string is the shortest initially
    
            for (String str : strings) {
                if (str.compareTo(shortest) < 0) {
                    shortest = str; // Update shortest if the current string is lexicographically smaller
                }
            }
    
            return shortest;
    }
}
