class Solution {

    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 0 || k == 0) return 0;
        int dp[][] = new int[k + 1][n];
        for (int i = 1; i < k + 1; i++) {
            for (int j = 1; j < n; j++) {
                int max = dp[i][j - 1];
                for (int x = 0; x < j; x++) {
                    max = Math.max(max, prices[j] - prices[x] + dp[i - 1][x]);
                }
                dp[i][j] = max;
            }
        }
        return dp[k][n - 1];
    }
}
