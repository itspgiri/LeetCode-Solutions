class Solution {
    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        getDiameter(root);
        return res - 1;
    }

    public int getDiameter(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = getDiameter(root.left);
        int right = getDiameter(root.right);
        res = Math.max(res, (left + right + 1));
        return Math.max(left, right) + 1;
    }
}
