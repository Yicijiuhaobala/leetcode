
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    f(n) = n/5+f(n/5)
    public int trailingZeroes{
//        if(0<=n&&n<=4){
//            return 0;
//        }
//        return n/5+trailingZeroes(n/5);
//
        int res = 0;
        int divisor = 5;
        while (divisor<=n){
            res+=n/divisor;
            n = n/divisor;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
