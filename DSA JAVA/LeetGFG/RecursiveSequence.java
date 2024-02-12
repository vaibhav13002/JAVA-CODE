package LeetGFG;

public class RecursiveSequence {
    public static void main(String[] args) {
        int n = 5;
        long result = calculateSequence(n);
        System.out.println("F(" + n + ") = " + result);
    }
    static long calculateSequence(int n) {
        return calculateTerm(1, 1, n);
    }
    static long calculateTerm(long current, int start, int n) {
        if (start > n) {
            return 0;
        } else {
            long product = 1;
            for (int i = 0; i < start; i++) {
                product *= current;
                current++;
            }
            return product + calculateTerm(current, start + 1, n);
        }
    }
}
