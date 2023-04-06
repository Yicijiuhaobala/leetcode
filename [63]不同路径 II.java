import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int[] array:
             dp) {
            Arrays.fill(array, -1);
        }
//        int index = 0;
//        for (int i = 0; i < obstacleGrid.length; i++) {
//            if(obstacleGrid[0][i]==1){
//                index=i;
//                break;
//            }
//        }
//        for(int i=)
        return dp(obstacleGrid, obstacleGrid.length-1, obstacleGrid[0].length-1);
    }
    public int dp(int[][] obstacleGrid, int m, int n){
        if(obstacleGrid[m][n]==1){
            return 0;
        }
        if(n==0){
            for (int i = 0; i < m; i++) {
                if(obstacleGrid[i][0]==1){
                    return 0;
                }
            }
            return 1;
        }
        if(m==0){
            for (int i = 0; i < n; i++) {
                if(obstacleGrid[0][i]==1){
                    return 0;
                }
            }
            return 1;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        dp[m][n] = dp(obstacleGrid, m-1, n) + dp(obstacleGrid, m, n-1);
        return dp[m][n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
