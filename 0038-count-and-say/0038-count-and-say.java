class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String s = countAndSay(n-1);
        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<s.length(); i++)
        {
            int j = i;
            while (j+1<s.length() && s.charAt(j) == s.charAt(j+1)) j++;
            sb.append(j-i+1);
            sb.append(s.charAt(i));
            i = j;
        }
        return sb.toString();
    }
}