class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        return memo(0, jobDifficulty, d, new Integer[n][d+1]);
    }
    public int memo(int i, int[] jb, int d, Integer[][] dp) {
        if(i == jb.length - 1 && d == 1) return jb[i];
        else if(i == jb.length && d == 0) return 0;
        else if((i == jb.length - 1 && d > 1) || d <= 0) return -1;
        else if(dp[i][d] != null) return dp[i][d];

        int minAns = Integer.MAX_VALUE;
        int maxJbDiff = Integer.MIN_VALUE;

        for(int k = i; k < jb.length - d + 1; k++) {
            maxJbDiff = Math.max(jb[k], maxJbDiff);
            int ans = memo(k + 1, jb, d - 1, dp);
            if(ans != -1) {
                minAns = Math.min(minAns, maxJbDiff + ans);
            }
        }

        dp[i][d] = minAns == Integer.MAX_VALUE ? -1 : minAns;
        return dp[i][d];
    }
    /**
    i=0, [], d
    int min = MAX; //make this min
    max = MIN
    //need to give atleast a job a day
    //so cant do all jobs on curr day if more days are there
    for k = i; k<n-d+1; k++ {
        //take [i:k] numbers on curr day
        //get max of this -> max
        ans = (k+1, [], d - 1)//ans for rest array
        min = Math.min(min, max + ans)
    }
    return min
    */
}