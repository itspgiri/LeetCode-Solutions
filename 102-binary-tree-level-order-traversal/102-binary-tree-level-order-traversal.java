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
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Integer> level=new ArrayList<>();
        while(queue.size()>0){
            root=queue.remove();
            while(queue.size()>0 && root!=null){
                level.add(root.val);
                if(root!=null){
                    if(root.left!=null)queue.add(root.left);
                    if(root.right!=null)queue.add(root.right);
                }
                root=queue.remove();
            }
            result.add(level);
            level=new ArrayList<>();
            if(queue.size()>0){
                queue.add(null);
            }
        }
        return result;
    }
}