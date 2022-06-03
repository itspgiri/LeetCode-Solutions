class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<>();
        int[][] dp = new int[numRows+1][numRows+1];
        
        for(int i = 1;i<numRows+1;i++){
            List<Integer> temp = new LinkedList<>();
            for(int j = 1;j<=i;j++){
                if(j==1 || i==j)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
                temp.add(dp[i][j]);
            }
            res.add(temp);
        }
        return res;
    }
}