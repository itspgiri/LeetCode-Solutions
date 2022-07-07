class Solution {
    public int characterReplacement(String str, int k) {
    int max = Integer.MIN_VALUE;
    int start, kdash;
    for(char c = 'A'; c <= 'Z'; ++c){
      start = 0; kdash = k; 
      for(int end = 0; end<str.length();end++){
        if(str.charAt(end)!=c){
          kdash--;
        }
        if(kdash<0){
          if(str.charAt(start)!=c) kdash++;
            start++;
        }else max = Math.max(end-start+1, max);
      }  
    }
    return max;
  }
}