class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return helper(word1).equals(helper(word2));
    }

    private String helper(String[] words){
        StringBuilder sb=new StringBuilder();
        for(String word:words){
            sb.append(word);
        }
        return sb.toString();
    }
}