import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] res;
    public int minDistance(String word1, String word2) {
        res = new int[word1.length()][word2.length()];
        for (int[] arr:res) {
            Arrays.fill(arr, -1);
        }
//        获取最长公共子序列
        int maxLength = dp(word1, 0, word2, 0);
        return word1.length()+word2.length()-maxLength*2;
    }
    public int dp(String word1, int index1, String word2, int index2){
        if(word1.length()==index1||word2.length()==index2){
            return 0;
        }
//        构建记录表，已经遍历过的地方直接返回
        if(res[index1][index2]!=-1){
            return res[index1][index2];
        }
        if(word1.charAt(index1)==word2.charAt(index2)){
            res[index1][index2] = 1 + dp(word1, index1+1, word2, index2+1);
        }else {
            res[index1][index2] = Math.max(dp(word1, index1+1, word2, index2),
                                            dp(word1, index1, word2, index2+1));
        }
        return res[index1][index2];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
