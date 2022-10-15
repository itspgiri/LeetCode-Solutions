class Solution {
    public int getLengthOfOptimalCompression(String s, int k) {
       
        int[][] dpq = new int[110][110];
        for (int i = 0; i <=s.length(); i++) for (int j = 0; j <= s.length(); j++) dpq[i][j] = 9999;
        dpq[0][0] = 0;
        for(int i = 1; i <=s.length(); i++) {
            for(int j = 0; j <= k; j++) {                
                int c = 0, de= 0;
                for(int l = i; l >= 1; l--) { 
                    if(s.charAt(l - 1) == s.charAt(i - 1)) c++;
                    else de++;
                    if(j - de >= 0) 
                        dpq[i][j] = Math.min(dpq[i][j], 
                                            dpq[l-1][j-de] + 1 + (c >= 100 ? 3 : c >= 10 ? 2 : c>= 2 ? 1: 0));
                }
                if (j > 0)
                    dpq[i][j] = Math.min(dpq[i][j], dpq[i-1][j-1]);
            }
        }
        return dpq[s.length()][k];  
    }
}