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
    int result = -1;
    
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return result;
    }
    
    private int height(TreeNode curr)
    {
        if (curr == null)
            return -1;
        
        int left = 1 + height(curr.left);
        int right = 1 + height(curr.right);
        result = Math.max(result, (left + right));
        return Math.max(left, right);
    }
}