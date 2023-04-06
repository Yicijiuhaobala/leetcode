
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int preimageSizeFZF(int k) {
        System.out.println(trailingZeroes(k));
        System.out.println(trailingZeroes_left(k));
        System.out.println(trailingZeroes_right(k));
//        return 0;
        return (int) (trailingZeroes_right(k)-trailingZeroes_left(k))+1;
    }
    public long trailingZeroes(long n){
        long res = 0;
        long divisor = 5;
        while(divisor<=n){
            res+=n/divisor;
            n/=divisor;
        }
        return res;
    }
    public long trailingZeroes_left(int k){
        long left = 0;
        long right = Long.MAX_VALUE;
        while(left<right){
            long mid = left+(right-left)/2;
            if(trailingZeroes(mid)==k){
                right=mid;
            }else if(trailingZeroes(mid)>k){
                right=mid;
            }else {
                left=mid+1;
            }
        }
        return left;
    }
    public long trailingZeroes_right(int k){
        long left = 0;
        long right = Long.MAX_VALUE;
        while(left<right){
            long mid = left+(right-left)/2;
            if(trailingZeroes(mid)==k){
                left=mid+1;
            }else if(trailingZeroes(mid)>k){
                right=mid;
            }else {
                left=mid+1;
            }
        }
        return left-1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
