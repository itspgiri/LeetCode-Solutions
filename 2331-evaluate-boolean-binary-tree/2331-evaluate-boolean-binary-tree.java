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
    public boolean evaluateTree(TreeNode root) {
        if (root.val == 0)
            return false;
        
        if (root.val == 1)
            return true;
        
        //non leaf node
        boolean left_val = evaluateTree(root.left);
        boolean right_val = evaluateTree(root.right);
        
        if (root.val == 2)
            return left_val | right_val;
        else
            return left_val & right_val;
    }
}