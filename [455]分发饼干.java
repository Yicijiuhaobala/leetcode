import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    先将大的饼干分给胃口大的孩子
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int start = s.length-1;
        for (int i = g.length-1; i >= 0 && start>=0 ; i--) {
            System.out.println(start);
//            System.out.println(g[i]);
//            System.out.println(s[start]);
            if(g[i]<=s[start]){
                count++;
                start--;
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
