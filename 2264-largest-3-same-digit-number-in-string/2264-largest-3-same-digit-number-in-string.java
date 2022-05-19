class Solution {
    public String largestGoodInteger(String num) {
        StringBuilder toFind = new StringBuilder("999");
        
        for (int i = 10; i > 0; i--) 
        {
            if (num.indexOf(toFind.toString()) != -1) 
                return toFind.toString();
            
            for (int j = 0; j < 3; j++) 
                toFind.setCharAt(j, (char) (toFind.charAt(j) - 1));
            
        }
        return "";
    }
}