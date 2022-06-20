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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<Integer>();
        arr = preorder(root, arr);
        return arr;
    }
    public static List<Integer> preorder(TreeNode root, List<Integer> parent)
    {
        if (root == null)
            return parent;
        
        List<Integer> child = new ArrayList<Integer>();
        child.add(root.val);
        parent.addAll(child);
        preorder(root.left , parent);
        preorder(root.right , parent);
        
        return parent;
    }
}