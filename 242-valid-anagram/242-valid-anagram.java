class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        int as[] = new int[26];
        for (char a : s.toCharArray()) {
            as[a - 'a'] += 1;
        }
        int at[] = new int[26];
        for (char a : t.toCharArray()) {
            at[a - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (as[i] != at[i]) return false;
        }
        return true;
    }
}
