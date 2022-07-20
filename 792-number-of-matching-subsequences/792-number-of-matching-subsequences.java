class Solution {
    public int numMatchingSubseq(String superString, String[] words) {
        
        int matchingSubSequences = 0, m = superString.length();
        HashMap<String, Integer> frequencyOfWords = new HashMap<>();
        for (String word : words)
            frequencyOfWords.put(word, frequencyOfWords.getOrDefault(word, 0) + 1);

        //Now use the same method used in the question isSubSequence?
        for (String subSequence : frequencyOfWords.keySet()){
            int i = 0, j = 0, n = subSequence.length();
            while (i < m && j < n){
                if (superString.charAt(i) == subSequence.charAt(j)){
                    j++;
                }
                i++;
            }
            if (j == n) matchingSubSequences += frequencyOfWords.get(subSequence);
        }
        return matchingSubSequences;
    }
}