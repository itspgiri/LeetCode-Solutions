class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1; //Our S pointer
        int j = t.length() - 1; //Our T Pointer
        int skipS = 0;
        int skipT = 0;
        
        while (i>=0 || j>=0) //We start from reverse for both the string
        {
            while (i>=0) //There can be a case where i finishes before j
            {
                if (s.charAt(i) == '#')
                {
                    skipS++; //Keeping track of how many skips
                    i--; //Going one char back on skipping once - cause # means one more back
                }
                else if (skipS>0) //If it's not negative skips and if we are with a non '#' character
                {
                    skipS--;
                    i--; //Going one char back
                }
                else break; //if nothing matches get out of the loop
            }
            while (j>=0) //There can be a case where j finishes before i
            {
                if (t.charAt(j) == '#')
                {
                    skipT++;
                    j--;
                }
                else if (skipT>0)
                {
                    skipT--;
                    j--;
                }
                else break;
            }
            
            
            if (i>=0 && j>=0 && s.charAt(i)!=t.charAt(j)) //if their current character is same or not and making sure we aren't going out of index
                return false;
            
            if ((i>=0) != (j>=0)) //If their lengths don't match
                return false;
            
            i--; 
            j--;
        }
        return true;
    }
}