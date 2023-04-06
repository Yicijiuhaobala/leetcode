
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
// 此时判断 小偷只能从第一户开始偷，最后一家不能偷 ，或者小偷从第二户开始偷，最后一户保证可以偷
        return Math.max(dp(nums, 0, nums.length-2),dp(nums, 1, nums.length-1));

    }
    public int dp(int[] nums, int start, int end){
        int n = nums.length;
//        int[] dp = new int[n+2];
        int dp_pre=0;
        int dp_post = 0;
        int dp_i = 0;
        for(int i=end; i>=start; i--){
            dp_i = Math.max(dp_pre, nums[i] + dp_post);
            dp_post = dp_pre;
            dp_pre = dp_i;
        }
        return dp_i;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
