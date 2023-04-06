
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCostClimbingStairs(int[] cost) {
//        int[] dp = new int[cost.length+1];
//        dp[0] = 0;
//        dp[1] = 0;
        int res = 0;
        int dp_pre = 0;
        int dp_pre_pre = 0;
        for (int i = 2; i < cost.length + 1; i++) {
            res = Math.min(dp_pre+cost[i-1], dp_pre_pre+cost[i-2]);
            dp_pre_pre = dp_pre;
            dp_pre = res;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
