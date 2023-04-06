
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int res = nums[0];
//        int[] dp = new int[nums.length];
        int dp_1 = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp_1 = Math.max(nums[i], nums[i]+dp_1);
            res = Math.max(res, dp_1);
        }
//        for (int i = 0; i < nums.length; i++) {
//            res = Math.max(res, dp[i]);
//        }
        return  res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
