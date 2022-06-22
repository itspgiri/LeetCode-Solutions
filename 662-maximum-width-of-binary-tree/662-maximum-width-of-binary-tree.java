class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> coor = new LinkedList<>();
        
        
        q.add(root);
        coor.add(0);
        int ans = 1;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                int j = coor.poll();
                
                min = (int)Math.min(j,min);
                max = (int)Math.max(j,max);
                
                if(curr.left != null){
                    q.add(curr.left);
                    coor.add(2*j+1);
                }
                
                if(curr.right != null){
                    q.add(curr.right);
                    coor.add(2*j+2);
                }
            }
            
            ans = (int)Math.max(max-min+1,ans);
        }
        
        return ans;
    }
}