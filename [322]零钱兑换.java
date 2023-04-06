import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int[] array :
                dp) {
            Arrays.fill(array, Integer.MAX_VALUE);
        }
//        for (int i = 0; i < amount; i++) {
//            dp[0][i] = 0;
//        }
        for (int i = 0; i < coins.length + 1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i < coins.length + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                if (j - coins[i - 1] >= 0 && dp[i - 1][j - coins[i - 1]] != Integer.MAX_VALUE) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - coins[i - 1]] + 1);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        int a = dp[dp.length - 1][dp[0].length - 1];
        return dp[3][8];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
