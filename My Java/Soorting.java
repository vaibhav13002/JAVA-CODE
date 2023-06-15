import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soorting {
    public static void main(String[] args) {
        List<Integer> obj=new ArrayList<>();
        obj.add(54);
        obj.add(25);
        obj.add(68);
        obj.add(21);

        Collections.sort(obj);
        System.out.println(obj);
    }
}
