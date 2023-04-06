import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] res;
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        res = new int[n][m];
        for(int[] arr: res){
            Arrays.fill(arr, -1);
        }
        return dp(grid, n-1,m-1);
    }
    public int dp(int[][] grid, int i, int j){
        if(i==0&&j==0){
            return grid[0][0];
        }
        if(i<0||j<0){
            return Integer.MAX_VALUE;
        }
        if(res[i][j]!=-1){
            return res[i][j];
        }
        res[i][j] =  grid[i][j] + Math.min(dp(grid, i-1, j), dp(grid, i, j-1));
        return res[i][j];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
