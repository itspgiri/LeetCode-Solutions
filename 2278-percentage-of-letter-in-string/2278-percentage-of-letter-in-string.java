class Solution {
    public int percentageLetter(String s, char letter) {
        int c = 0;
        int n = s.length();
        for (int i=0; i<n; i++){
            if (s.charAt(i) == letter)
                c++;
        }
        int ans = 100 * c / n;
        return ans;
    }
}