class Solution {
    public boolean isAnagram(String s, String t) {
      int arr_s[] = new int[26];
        for (char a : s.toCharArray())
        {
            arr_s[ a - 'a'] += 1;
        }
        int arr_t[] = new int[26];
        for (char a : t.toCharArray())
        {
            arr_t[ a - 'a'] += 1;
        }
        for (int i=0; i<26; i++)
        {
            if (arr_s[i] != arr_t[i])
                return false;
        }
        return true;
    }
}