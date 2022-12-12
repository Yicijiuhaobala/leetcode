
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        if(x == 1 || x == 2 || x == 3){
            return 1;
        }
        for (int i = 1; i <= x; i++) {
            if(i*i == x){
                return i;
            }else if(i*i>x){
                return i-1;
            }
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
