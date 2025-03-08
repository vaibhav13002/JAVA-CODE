package Stack_Queue;

import java.util.HashMap;

public class CarFleet853 {
    public static void main(String[] args) {
        int target = 12;
        int[] position = {10,8,0,5,3};
        int[] speed = {2,4,1,1,3};
        System.out.println(WrongSolution(target, position, speed));
    }
    public static int WrongSolution(int target , int[] position, int[] speed){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<position.length; i++){
            int a = position[i]+speed[i];
            if(map.containsKey(a)){
                map.put(a, map.get(a) + 1);
                a=0;
            }else{
                map.put(a,1);
                a=0;
            }
        }
        return map.size();
    }
}
