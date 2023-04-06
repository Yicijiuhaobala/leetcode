import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] res;
    public int rob(int[] nums) {
        res = new int[nums.length];
        Arrays.fill(res, -1);
        return dp(nums, 0);
    }
    public int dp(int[] nums, int index){
        if(index>=nums.length){
            return 0;
        }
        if(res[index]!=-1){
            return res[index];
        }
        res[index] = Math.max(dp(nums, index+1), nums[index]+dp(nums, index+2));
        return res[index];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
