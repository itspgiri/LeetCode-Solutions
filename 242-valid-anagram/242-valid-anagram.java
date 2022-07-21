class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        char a_s[] = s.toCharArray();
        char a_t[] = t.toCharArray();
        
        Arrays.sort(a_s);
        Arrays.sort(a_t);
        
        s = Arrays.toString(a_s);
        t = Arrays.toString(a_t);
                
        if (s.equals(t))
            return true;
        return false;
    }
}