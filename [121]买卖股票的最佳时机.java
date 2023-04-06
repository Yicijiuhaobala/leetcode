
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
//        int minPrice = Integer.MAX_VALUE;
//        int maxProfie = 0;
//        for(int i=0;i<prices.length;i++){
//            if(prices[i]<minPrice){
//                minPrice = prices[i];
//            }else if(prices[i] - minPrice > maxProfie){
//                maxProfie = prices[i] - minPrice;
//            }
//        }
//        return maxProfie;
        /*
        dp[i][k][0] = Math.max(dp[i-1][k][0], dp[i-1][k][1]+prices[i]);
        dp[i][k][1] = Math.max(dp[i-1][k][1], dp[i-1][k-1][0]-prices[i]);
         */
        int n = prices.length;
//        int[][] dp = new int[n][2];
        int dp_0=0;
        int dp_1=0;
        for (int i = 0; i < n; i++) {
            if(i-1==-1){
//                dp[i][0]=0;
//                dp[i][1]=-prices[i];
                dp_1=0;
                dp_1=-prices[i];
                continue;
            }
            dp_0 = Math.max(dp_0, dp_1 + prices[i]);
            dp_1 = Math.max(dp_1,  -prices[i]);
        }
        return dp_0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
