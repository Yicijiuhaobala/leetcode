import javax.swing.*;
import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] res;
    public int longestCommonSubsequence(String text1, String text2) {
        res = new int[text1.length()][text2.length()];
        for (int[] arr: res) {
            Arrays.fill(arr, -1);
        }
        return dp(text1, 0, text2, 0);
    }
    public int dp(String text1, int index1, String text2, int index2){
//        遍历完毕了其中一个字符串，说明后面不存在公共子序列
        if(text1.length()==index1||text2.length()==index2){
            return 0;
        }
//        存储res数组，避免循环遍历
        if(res[index1][index2]!=-1){
            return res[index1][index2];
        }
        if(text1.charAt(index1)==text2.charAt(index2)){
            res[index1][index2] = 1+dp(text1, index1+1, text2, index2+1);
            return res[index1][index2];
        }
        res[index1][index2] = Math.max(dp(text1, index1+1, text2, index2),
                dp(text1, index1, text2, index2+1));
        return res[index1][index2];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
