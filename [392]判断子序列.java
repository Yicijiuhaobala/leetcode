
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isSubsequence(String s, String t) {
        int s1 = s.length();
        int t1 = t.length();
        if(s1>t1){
            return false;
        }
        if(s.length()==0){
            return true;
        }
        int index1=0;
        for (int i = 0; i < t1; i++) {
            if(t.charAt(i)==s.charAt(index1)){
                index1++;
                if(index1==s1){
                    return true;
                }
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
