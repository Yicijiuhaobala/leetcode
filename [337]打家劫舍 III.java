
//leetcode submit region begin(Prohibit modification and deletion)

import java.util.HashMap;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public HashMap<TreeNode, Integer> hashMap = new HashMap<TreeNode, Integer>();
    public int rob(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(hashMap.containsKey(root)){
            return hashMap.get(root);
        }
//        不偷这个节点，那么该节点的左子节点和右子节点都可以偷
        int not_do_root = rob(root.left) + rob(root.right);
//        偷这个节点，那么该节点的左子节点和右子节点都不可以偷，判断两个子节点是否为空，不为空则偷两个子节点的左右子节点。
        int do_root = root.val +
                        (root.left==null?0:rob(root.left.left)+rob((root.left.right)))+
                        (root.right==null?0:rob(root.right.left)+rob(root.right.right));
        int res = Math.max(not_do_root, do_root);
        hashMap.put(root, res);
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
