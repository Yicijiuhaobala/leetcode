
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num:nums){
            sum+=num;
        }
//        加入sum和不为偶数直接返回false
        if(sum%2!=0){
            return false;
        }
        sum = sum/2;
        boolean[][] dp = new boolean[nums.length+1][sum+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(j-nums[i-1]<0){
//                    空间不够，直接不填入第i个数
                    dp[i][j] = dp[i-1][j];
                }else {
//                    填入第i个数或者不填入第i个数
                    dp[i][j] = dp[i-1][j]||dp[i-1][j-nums[i-1]];
                }
            }

        }
        return dp[nums.length][sum];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
