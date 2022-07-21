class Solution {

    public boolean isAnagram(String s, String t) {
        int as[] = new int[26];
        for (char a : s.toCharArray()) {
            as[a - 'a'] += 1;
        }
        for (char a : t.toCharArray()) {
            as[a - 'a'] -= 1;
        }
        for (int x : as)
            if (x!=0)
                return false;
        
        return true;
    }
}
