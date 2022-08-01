class Solution {
    HashMap<String, Integer> map = new HashMap<String, Integer>();

    public int uniquePaths(int m, int n) {
        if (m < 1 || n < 1) return 0;
        if (m == 1 && n == 1) return 1;
        if (map.containsKey("" + m + "," + n)) 
            return map.get("" + m + "," + n); 
        
        else map.put("" + m + "," + n, uniquePaths(m - 1, n) + uniquePaths(m, n - 1));
        
        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }
}
