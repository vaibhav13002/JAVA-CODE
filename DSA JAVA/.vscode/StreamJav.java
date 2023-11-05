import java.util.*;
import java.util.stream.Stream;

public class StreamJav {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,6,7,8,9);
        // nums.forEach(n -> System.out.println(n));

        Stream<Integer> data = nums.stream();
        data.forEach(n -> System.out.println(n));
        // data.forEach(n -> System.out.println(n));  //using 2nd time will give an error as stream is already been used 
    }
}
