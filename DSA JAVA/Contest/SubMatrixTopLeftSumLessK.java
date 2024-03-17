package Contest;
//Weekly Contest 387
public class SubMatrixTopLeftSumLessK {
    public static void main(String[] args) {
        int[][] grid = { {7,6,3}, {6,6,1}};
        System.out.println(Check(grid, 18));
    }
    public static int Check(int[][] grid, int target){
        int ans = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        
        for (int row = 0; row < rows; row++) {  // prefix sum usee kr rhe h nd sab box me row wise sum add kr rhe h
            for (int col = 1; col < cols; col++) {
                grid[row][col] += grid[row][col - 1];
            }
        }
        for (int col = 0; col < cols; col++) {  // each position pr condition check
            int sum = 0;
            for (int row = 0; row < rows; row++) {
                sum += grid[row][col];
                if(sum <= target){
                    ans++;
                }
            }
        }
        return ans;
    }
}
