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
        
        boolean l = evaluateTree(root.left);
        boolean r = evaluateTree(root.right);
        
        int s = root.val;
        if (s == 3)
            return l && r;
            
        if (s == 2)
            return l | r;
          
        return false;
    }
}