class Solution {
   public int numIslands(char[][] grid) {
    
    int count=0;
    boolean[][] visited=new boolean[grid.length][grid[0].length];
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='1' && visited[i][j]==false){
                drawTree(grid,i,j,visited);
                count++;
            }
        }
    }
    return count;
}
    public void drawTree(char[][] grid, int i, int j, boolean[][] visited){
        
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length  || visited[i][j]==true || grid[i][j]=='0'){
            return; //. proactive call. after funcn call we eliminate if call made wrong
        }
        
        visited[i][j]=true;
        drawTree(grid,i-1,j,visited);
        drawTree(grid,i,j+1,visited);
        drawTree(grid,i,j-1,visited);
        drawTree(grid,i+1,j,visited);
    }
}
