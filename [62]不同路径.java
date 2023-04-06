import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];

//        for (int i = 1; i < m; i++) {
//            dp[i][0] = 1;
//        }
//        for (int i = 0; i < n; i++) {
//            dp[0][i] = 1;
//        }
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                dp[i][j] = dp[i-1][j]+dp[i][j-1];
//            }
//        }
//        return dp[m-1][n-1];
        for (int[] array:
             dp) {
            Arrays.fill(array, -1);
        }
        return dp(m-1,n-1);
    }
    public int dp(int m, int n){
        if(m==0||n==0){
            return 1;
        }
//        if()
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//
//            }
//        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        dp[m][n] = dp(m-1, n)+dp(m,n-1);
        return dp[m][n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
