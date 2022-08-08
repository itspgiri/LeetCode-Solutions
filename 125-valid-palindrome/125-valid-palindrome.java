class Solution {

    public static String convertString(String s) {
        String res = "";
        s = s.toLowerCase();
        for (char a : s.toCharArray()) {
            if (a >= 'a' && a <= 'z' || a>='0' && a<='9') res = res + a;
        }
        return res;
    }

    public boolean isPalindrome(String s) {
        s = convertString(s);
        String pal = "";

        for (char a : s.toCharArray()) pal = a + pal;

        if (s.equals(pal)) return true; else return false;
    }
}
