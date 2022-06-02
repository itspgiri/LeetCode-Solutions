class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix[0].length;
        int n=matrix.length;
        int x[][] = new int[m][n];
        for (int i=0; i<m;i++)
        {
            for (int j=0; j<n;j++)
            {
                x[i][j]=matrix[j][i];
            }
        }
        return x;
    }
}