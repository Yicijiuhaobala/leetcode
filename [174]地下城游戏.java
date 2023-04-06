import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] dp;
    public int calculateMinimumHP(int[][] dungeon) {
//        dp数组表示的是dp[i][j] 从坐标i，j的地方到右下角所需的最低初始健康点数
        dp = new int[dungeon.length][dungeon[0].length];
        for (int[] array:
             dp) {
            Arrays.fill(array, -1);
        }
        return dp(dungeon, 0, 0);
    }
    public int dp(int[][] dungeon, int i, int j){
        if(i==dp.length-1&&j==dp[0].length-1){
            return dungeon[i][j]>0?1:1-dungeon[i][j];
        }
        if(i==dp.length||j==dp[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int res = Math.min(dp(dungeon, i+1, j), dp(dungeon, i, j+1)) - dungeon[i][j];
        dp[i][j] = res>0?res:1;
        return dp[i][j];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
