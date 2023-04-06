
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
//      dp[2] = dp[0]*dp[1] + dp[1]*dp[0]
//        dp[3] = dp[2]*dp[0] + dp[1]*dp[1] + dp[0]*dp[2]
//        dp[4] = dp[3]*dp[0] + dp[2]*dp[1] + dp[1]*dp[2] + dp[0]*dp[3]
        for (int i = 2; i < n+1; i++) {
            for (int j = i-1; j >=0 ; j--) {
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
