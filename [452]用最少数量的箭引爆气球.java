import java.util.Arrays;
import java.util.Comparator;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length==0){
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
//                return o1[1]-o2[1];
//                替换掉直接相减，避免数值溢出
                if(o1[1]>o2[1]){
                    return 1;
                }
                if(o1[1]<o2[1]){
                    return -1;
                }
                return 1;
            }
        });
        int count = 1;
        int end = points[0][1];
        for (int[] point:points) {
//            System.out.println(point[0]);
            if(point[0]>end){
                count++;
                end = point[1];
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
