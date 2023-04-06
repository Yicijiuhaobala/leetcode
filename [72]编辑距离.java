import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] temp;
    public int minDistance(String word1, String word2) {
        int i = word1.length();
        int j = word2.length();
        temp = new int[i][j];
        for (int k = 0; k < i; k++) {
            Arrays.fill(temp[k], -1);
        }
        return dp(word1, i-1, word2, j-1);
    }
    public int dp(String word1, int i, String word2, int j){
        if(i<0) {
            return j+1;
        }
        if(j<0){
            return i+1;
        }
        if(word1.charAt(i)==word2.charAt(j)){   // 字符相同 ，跳过
            return dp(word1, i-1, word2, j-1);
        }
        if(temp[i][j]!=-1){
            return temp[i][j];
        }
        temp[i][j] = min(dp(word1, i-1, word2, j-1)+1,  // 替换
                dp(word1, i, word2, j-1)+1,     // 插入
                dp(word1, i-1, word2, j)+1);    // 删除
        return temp[i][j];
    }

    public int min(int a, int b, int c){
        return Math.min(a, Math.min(b, c));
    }
}
//leetcode submit region end(Prohibit modification and deletion)
