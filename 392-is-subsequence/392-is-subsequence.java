class Solution {
       public static boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if (sLength > tLength) {
            return false;
        } else if(sLength == 0) {
            return true;
        }
        char seachingChar =s.charAt(0);
        int searchIndex = 0;

        for (int i = 0; i< tLength; i++) {
            if (seachingChar == t.charAt(i)) {
                if (searchIndex == sLength - 1) {
                    return true;
                }
                seachingChar = (s.charAt(++searchIndex));
            }
        }
        return false;
    }
}