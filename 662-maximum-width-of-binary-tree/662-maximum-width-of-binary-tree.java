class Solution {
    class Pair{
        long min;
        long max;
    }
    long maxWidth=0;
    public int widthOfBinaryTree(TreeNode root) {
        maxWidth=0;
        HashMap<Integer,Pair> map = new HashMap<>();
        helper(root,1,1,map);
        return (int)maxWidth;
            
    }
    public void helper(TreeNode node,int level, long idx , HashMap<Integer,Pair> map){
        if(node==null){
            return ;
        }
        
        helper(node.left , level+1, 2*idx,map );
        helper(node.right,level+1,2*idx+1,map);
        
        Pair p=null;
        if(map.containsKey(level)){
            p = map.get(level);
            p.max= idx;
        }else{
            p = new Pair();
            p.min=idx;
            p.max=idx;
            map.put(level,p);
        }
        
        long currentWidth = p.max -p.min+1;
        if(currentWidth > maxWidth){
            maxWidth = currentWidth;
        }
        
        
    }
}