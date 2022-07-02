/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        if(root == null)
        {
            return null;
        }
        int curr = root.val;
        
        if(q.val>curr && p.val>curr)
        {
            return lowestCommonAncestor(root.right,p,q);
        }
       if(q.val<curr && p.val<curr)
        {
           return  lowestCommonAncestor(root.left,p,q);
        }
        return root;
    }
}