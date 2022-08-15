class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> alphabet = initAlphabet();
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (alphabet.get(s.charAt(i)) < alphabet.get(s.charAt(i + 1)))
                result = result - alphabet.get(s.charAt(i));
            else 
                result = result + alphabet.get(s.charAt(i));
        }
        return result + alphabet.get(s.charAt(s.length() - 1));
    }

    private Map<Character, Integer> initAlphabet() {
        return Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
    }
}