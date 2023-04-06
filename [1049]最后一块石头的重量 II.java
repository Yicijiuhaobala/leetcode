
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int a:
             stones) {
            sum+=a;
        }
        int target = sum/2;
        int[][] dp = new int[stones.length+1][target+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(j-stones[i-1]>=0){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-stones[i-1]]+stones[i-1]);
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return sum - dp[dp.length-1][dp[0].length-1]-dp[dp.length-1][dp[0].length-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
