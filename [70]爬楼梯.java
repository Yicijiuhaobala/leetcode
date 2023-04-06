
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        if(n==1){
            return  1;
        }
        if(n==2){
            return 2;
        }
        dp[1]=1;
        dp[2]=2;
        if(n>=3){
            for (int i = 3; i < n+1; i++) {
                dp[i] = dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
