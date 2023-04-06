import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] res;
    public int minimumDeleteSum(String s1, String s2) {
        res = new int[s1.length()][s2.length()];
        for (int[] arr:res) {
            Arrays.fill(arr, -1);
        }
        return dp(s1, 0, s2, 0);
    }
    public int dp(String s1, int index1, String s2, int index2){
        int leftNumber = 0;
        if(s1.length()==index1){
            for (; index2 < s2.length(); index2++) {
                leftNumber += s2.charAt(index2);
            }
            return leftNumber;
        }
        if(s2.length()==index2){
            for (; index1 < s1.length(); index1++) {
                leftNumber += s1.charAt(index1);
            }
            return leftNumber;
        }
        if(res[index1][index2]!=-1){
            return res[index1][index2];
        }
        if(s1.charAt(index1)==s2.charAt(index2)){
            res[index1][index2] = dp(s1, index1+1, s2, index2+1);
            return res[index1][index2];
        }
        res[index1][index2] = Math.min(s1.charAt(index1)+dp(s1, index1+1, s2, index2),
                                        s2.charAt(index2)+dp(s1, index1, s2, index2+1));
        return res[index1][index2];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
