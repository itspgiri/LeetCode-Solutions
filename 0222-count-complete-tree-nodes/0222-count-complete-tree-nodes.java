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
   public int countNodes(TreeNode root) {
	if (root==null) return 0;
	if (root.left==null) return 1;
	int height = 0;
    int nodesSum = 0;
	TreeNode curr = root;
    while(curr.left!=null) {
    	nodesSum += (1<<height);
    	height++;
    	curr = curr.left;
    }
    return nodesSum + countLastLevel(root, height);
}

private int countLastLevel(TreeNode root, int height) {
	if(height==1) 
		if (root.right!=null) return 2;
		else if (root.left!=null) return 1;
		else return 0;
	TreeNode midNode = root.left;
	int currHeight = 1;
	while(currHeight<height) {
		currHeight++;
		midNode = midNode.right;
	}
	if (midNode==null) return countLastLevel(root.left, height-1);
	else return (1<<(height-1)) + countLastLevel(root.right, height-1);
}
}