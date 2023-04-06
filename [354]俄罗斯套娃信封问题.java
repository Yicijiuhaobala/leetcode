import java.util.Arrays;
import java.util.Comparator;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]==o2[0]?o2[1]-o1[1]:o1[0]-o2[0];
            }
        });
        int[] height = new int[envelopes.length];
        for(int i=0; i<envelopes.length; i++){
            height[i] = envelopes[i][1];
        }
        for (int[] a:
             envelopes) {
            System.out.println(Arrays.toString(a));
        }
        return  maxLength(height);
    }
    public int maxLength(int[] nums){
        int[] dp = new int[nums.length];
        int profile = 0;
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = profile;
            int value = nums[i];
            while(left<right){
                int mid = left+(right-left)/2;
                if(dp[mid]<value) {
                    left=mid+1;
                } else if(dp[mid]>value) {
                    right = mid;
                } else {
                    right = mid;
                }
            }
            if(left==profile) {
                profile++;
            }
            dp[left] = value;
        }
        return profile;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
