class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String res="";
        for(int i=0;i<words.length;i++)
        {
            res=res+words[i];
            
            if(s.equals(res))
                return true;
            
            else
                continue;
            
        }
        
        return false;
        
        
        
    }
}