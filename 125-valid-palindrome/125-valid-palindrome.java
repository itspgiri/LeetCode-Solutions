class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() -1;
        
        while (i<j)
        {
            char first = s.charAt(i);
            char last = s.charAt(j);
            
            if (Character.isLetterOrDigit(first) == false)
            {
                i++;
                continue;
            }
            
            if (Character.isLetterOrDigit(last) == false)
            {
                j--;
                continue;
            }
            
            if (Character.toLowerCase(first) != Character.toLowerCase(last))
            {
                return false;
            }
            
            i++;
            j--;
        }
        return true;
    }
}