class Solution {
    public static int numRollsToTarget(int n, int k, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            // now we need the tmp array because we cannot iterate from right to left because we are doing rolling sum
            int[] tmp = new int[target + 1];
            int rollingSum = 0;
            int jmin = Math.max(1, target - k * (n - 1 - i));
            // this is the initial value for the rolling sum.
            // it needs to add the k numbers before jmin index
            for (int j = Math.max(1, jmin - k); j < jmin; j++) {
                rollingSum += dp[j - 1];
                rollingSum %= 1000000007;
            }
            for (int j = jmin; j <= target - (n - 1 - i); j++) {
                // add a cell to the window
                rollingSum += dp[j - 1];
                rollingSum %= 1000000007;
                if (j - k - 1 >= 0) {
                    // remove a cell from the window
                    rollingSum -= dp[j - k - 1];
                    if(rollingSum < 0) rollingSum += 1000000007;
                }
                tmp[j] = rollingSum;
            }
            dp = tmp;
        }

        return dp[target];
    }
}
