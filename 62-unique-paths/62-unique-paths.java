class Solution {
    public int uniquePaths(int m, int n) {
        int arr[][] = new int[m][n];
        int i = 0;
        int j = 0;
        return PT(arr,m,n,i,j);
    }
    
    private int PT(int[][] arr, int m,int n,int i,int j){
        if(i >= m || j >= n){
            return 0;
        }
        
        if(i == m-1 && j == n-1){
            return 1;
        }
        
        if(arr[i][j] != 0){
            return arr[i][j];
        }
        
        return arr[i][j] = PT(arr,m,n,i+1,j) + PT(arr,m,n,i,j+1);
    }
}