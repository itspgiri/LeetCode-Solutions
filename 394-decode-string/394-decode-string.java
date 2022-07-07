class Solution {
    public String decodeString(String s) {
        StringBuilder ans = new StringBuilder();
        int loop = 0;
        String rec = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 97 && ch <= 122) ans.append(ch);
            else if (ch >= 48 && ch <= 57) loop = loop * 10 + (ch - 48);
            else if (ch == '[') {
                rec = decodeString(s.substring(i + 1));
                for (int j = 0; j < loop; j++) ans.append(rec);
                int count = 1;
                while (count != 0) {
                    i++;
                    if (s.charAt(i) == '[') count++;
                    else if (s.charAt(i) == ']') count--;
                }
                loop = 0;
            }
            else if (ch == ']') break;
            
        }
        return ans.toString();
    }
}