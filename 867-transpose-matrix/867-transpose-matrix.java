class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[][] res = new int[n][m];
        
        for(int i = 0; i < m*n; ++i) {
            res[i%n][i/n] = matrix[i/n][i%n];
        }
        return res;
    }
}


