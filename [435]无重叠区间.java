import java.util.Arrays;
import java.util.Comparator;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        return intervals.length-Intervals(intervals);
    }
//    先将二维数组进行排序，按end的大小进行升序排序，第一个数组的end为最小
//    当后面数组的start比end大，说明不存在重叠，保存下来，并更新
    public int Intervals(int[][] intervals){
        if(intervals.length==0){
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int count = 1;
        int end = intervals[0][1];
        for (int[] inter :intervals) {
            if(inter[0]>=end){
                count++;
                end = inter[1];
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
