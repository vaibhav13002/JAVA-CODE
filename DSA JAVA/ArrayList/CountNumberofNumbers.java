package ArrayList;
public class CountNumberofNumbers {
    public static void main(String[] args) {
        int[] nums={146,2222,32,4,52837};
        System.out.println(Check(nums));

    }
    static int Check(int[] nums){
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;     
}
    static boolean even(int num) {
        int numberofDigit=CountTheNumber(num);
        if(numberofDigit%2==0){
            return true;
        }
        return false;
    }
    static int CountTheNumber(int num){
        int count=0;
        while (num>0) {
            num /=10;
            count++;
        }
        return count;
    }
    }

