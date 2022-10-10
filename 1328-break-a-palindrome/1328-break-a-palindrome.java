class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() < 2){
            return "";
        }
        char []palindromeChar = palindrome.toCharArray();
        for(int index=0;index<palindromeChar.length/2;index++){
            if(palindromeChar[index] != 'a'){
                palindromeChar[index] ='a';
                return String.valueOf(palindromeChar);
            }
        }
        
        palindromeChar[palindromeChar.length -1] = 'b';
        return  String.valueOf(palindromeChar);
        
    }
}