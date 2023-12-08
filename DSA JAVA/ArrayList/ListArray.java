package ArrayList;

import java.util.ArrayList;

import java.util.Collections;



public class ListArray {
    public static void main(String[] args) {
        // ArrayList<Integer> nums=new ArrayList<Integer>();
        // Set<Integer> nums=new HashSet<Integer>();   //only unique value it will show
        //Set<Integer> nums=new TreeSet<Integer>();    //sorted and unique value
        // nums.add(61);
        // nums.add(71);
        // nums.add(30);
        // nums.add(12);
        // nums.add(71);

        // // System.out.println(nums.get(2));
        // for(int n : nums){
        //     System.out.println(n);
        // }
        // System.out.println(nums);

  ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Collections.sort(cars);  // Sort cars
    for (String i : cars) {
      System.out.println(i);
    }
    }
}
