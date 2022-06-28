class Solution {
	int diameter=0;
	public int diameterOfBinaryTree(TreeNode root) {
	   height(root);
		return  diameter-1; 
	}
	int height(TreeNode root){
		if(root==null){
			return 0;
		}
		int l=height(root.left);
		int r=height(root.right);
		diameter=Math.max(diameter,l+r+1);
		return 1+Math.max(l,r);
	}
}