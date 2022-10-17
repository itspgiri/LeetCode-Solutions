class Solution {
public boolean checkIfPangram(String sentence) {

    int size = sentence.length();
    
    if (size < 26) return false;
    int[] arr = new int[26];
    
    for (int i = 0; i < size; i++){
        arr[sentence.charAt(i)-'a']++;
    }
    
    for (int i: arr){
        if (i == 0) return false;
    }
    
    return true;
}
}