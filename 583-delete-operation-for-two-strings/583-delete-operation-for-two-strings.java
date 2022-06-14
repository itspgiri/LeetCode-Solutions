class Solution {
    
    public int minDistance(String s, String t) {
        
        int m = s.length(), n = t.length();
        int[] dp = new int[n + 1];
        
        for(int j = 0; j <= n; j++) dp[j] = j;
            
        
        for(int i = 1; i <= m; i++){
            int[] curr = new int[n + 1];
            curr[0] = i;
			
            for(int j = 1; j <= n; j++){
                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    curr[j] = dp[j - 1];
                } else {
                    int deleteInS = dp[j];
                    int deleteInT = curr[j - 1];
                    curr[j] = Math.min(deleteInS, deleteInT) + 1;
                }
            }
            dp = curr;
        }
        return dp[n];
    }
}