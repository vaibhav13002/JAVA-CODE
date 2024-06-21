package Blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams49 {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String s = strs[i];
            char[] c = s.toCharArray();
            Arrays.sort(c);
            // String newStr = new String(c);
            String newStr=String.valueOf(c);
            if(map.containsKey(newStr)){
                map.get(newStr).add(s);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(s);
                map.put(newStr, temp);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String key : map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
}


// Create an HashMap                              Checking = sorted
// iterate array of String                        Adding = original      
// get first String
// convert it into array (char array)
// sort it
// convert it into string again

// check if sorted one is present in hashmap or not 
// if yes add the original one which we had iterated into map (basically hum already bane hue arraylist me value ko add kr rhe h jisme already ek h)
//  if not then create an new ArrrayList and put original string into it 
//  put that arraylist corresponding sorted group of String; (sorted usi ka ha)

//  at last we need to fetch hashmap (map.keySet()) and add the values of the each corresponding key in an arraylist of our ans and return it



// Time complexity:
// O(NKlogK)
// N - number of strs,
// K - length of max String

// Space complexity:
// O(NK)O(NK)O(NK)