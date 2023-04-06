
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        /*
        A代表符号为+  B代表符号为- ，问题转换为背包问题
        A-B=target
        A=target+B
        A+A=target+B+A
        2*A = target+sum(nums)
        A = (target+sum(nums))/2
     */
        int sum = 0;
        for(int number:nums){
            sum+=number;
        }
        int sum_post = (sum+target)/2;
        System.out.println(sum_post);
        if(sum<Math.abs(target)||(sum+target)%2!=0){
            return 0;
        }

        int[][] dp = new int[nums.length+1][sum_post+1];
//        for (int i = 0; i < dp.length; i++) {
//            dp[i][0] = 1;
//        }
        dp[0][0] = 1;
        System.out.println(dp.length);
        System.out.println(dp[0].length);
//        当target为0时，存在dp[i][j]有多种情况，加入前几个元素都是为0，那么存在多种情况和为0
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(j-nums[i-1]<0){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
