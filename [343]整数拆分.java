import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] dp;
    public int integerBreak(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        int a = dp(n);
        return a ;

    }
    public int dp(int n){
        if(n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        for (int i = 1; i < n; i++) {
//            dp[n]代表上一个遍历的大小，
//            i*dp(n-i)代表把数分为i和n-i，同时n-i还能在进行划分，
//            i*(n-i)代表把数分为i和n-i，但是n-i和i不再进行划分
            dp[n] = max(dp[n], i*dp(n-i), i*(n-i));
        }
        return dp[n];
    }
//    求出三个数的最大值
    public int max(int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
