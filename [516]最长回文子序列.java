import java.util.ArrayList;
import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] res;
    public int longestPalindromeSubseq(String s) {
        res = new int[s.length()][s.length()];
        for (int[] arr:res) {
            Arrays.fill(arr, -1);
        }
        return dp(s,0,s.length()-1);
    }
    public int dp(String s, int left, int right){
        if(left==right){
            return 1;
        }
        if(left>right){
            return 0;
        }
        if(res[left][right]!=-1){
            return res[left][right];
        }
        if(s.charAt(left)==s.charAt(right)){
            res[left][right]=dp(s, left+1, right-1)+2;
        }else {
            res[left][right]=Math.max(dp(s, left+1, right),
                                        dp(s, left, right-1));
        }
        return res[left][right];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
