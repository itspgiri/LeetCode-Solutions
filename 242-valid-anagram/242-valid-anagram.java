public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s==null && t==null) return true;
        else if (s==null || t==null) return false;
        else if (s.length() != t.length()) return false;

        final Map<Integer, Integer> dict = new HashMap<>();
        s.codePoints().forEach(code -> dict.put(code, dict.getOrDefault(code, 0) + 1));
        t.codePoints().forEach(code -> dict.put(code, dict.getOrDefault(code, 0) - 1));
        
        for(int count : dict.values()) {
            if (count<0) return false;
        }

        return true;
    }
}