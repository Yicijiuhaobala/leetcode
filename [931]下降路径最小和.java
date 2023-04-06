import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution{
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.min(1,23,4));

    }
    public int[][] temp;
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int res = Integer.MAX_VALUE;
        temp = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(temp[i],666666);
        }
//        System.out.println(matrix[1][0]);
        for(int j=0; j<=n; j++){
            res = Math.min(res, dp(matrix, n-1, j));
        }
        return res;
    }
    public int dp(int[][] matrix, int i, int j){
        if(i<0||j<0||i>=matrix.length||j>=matrix[0].length){
            return 9999999;
        }
        if(i==0){
            return matrix[i][j];
        }
        if(temp[i][j]!=666666){
            return temp[i][j];
        }
        temp[i][j] = matrix[i][j]+min(dp(matrix,i-1,j-1), dp(matrix, i-1, j), dp(matrix, i-1, j+1));
        return temp[i][j];

    }
    public int min(int a, int b, int c){
        return a<(b<c?b:c)?a:(b<c?b:c);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
