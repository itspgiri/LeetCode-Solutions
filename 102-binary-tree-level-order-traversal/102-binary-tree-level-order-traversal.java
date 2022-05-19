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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        while(!queue.isEmpty())
        {
            List<Integer> Level_Result = new ArrayList<Integer>();
            int current_level = queue.size();
            for (int i=0; i<current_level; i++)
            {
                TreeNode n = queue.poll();
                Level_Result.add(n.val);
                if (n.left != null)
                queue.offer(n.left);
                if (n.right != null)
                queue.offer(n.right);
            }
            result.add(Level_Result);
        }
        return result;
    }
}