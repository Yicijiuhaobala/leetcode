
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {
        int index = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i)!=' '){
                index++;
            }
            if(index != 0 && s.charAt(i)==' '){
                break;
            }
        }
        return index;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
