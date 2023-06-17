import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student{
    int age;
    String name;

    // @Generated("sohibe.vscode")
    // @Override
    // public String toString() 
    // {
    //     return "{" +
    //         " age='" + getAge() + "'" +", name='" + getName() + "'" +"}";
    // }

}

public class Soorting {
    public static void main(String[] args) {
        
        Comparator<Integer> com=new Comparator<Integer>() 
        {
            public int compare(Integer i,Integer j)
            {
                if (i%10 > j%10)
                return 1;
                else
                return -1;
            }    
        };
        List<Integer> obj=new ArrayList<>();
        obj.add(54);
        obj.add(25);
        obj.add(68);
        obj.add(21);
        Collections.sort(obj,com);
        // sortArray(obj,obj.length);
        
        System.out.println(obj);
    }
}
