class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if(n % 2 != 0) return new int[0];
        
        int[] freq = new int[200005];
        for(int num : changed) freq[num]++;
        
        int[] ret = new int[n / 2];
        int idx = 0;
        for(int i = 1; i < freq.length; i++){
            if(freq[i] == 0) continue;
            
            if(freq[i * 2] <= 0) return new int[0];
            for(int j = 0; j < freq[i]; j++){
                ret[idx++] = i;
            }
            freq[i * 2] -= freq[i];
        }
        
        return ret;
        
    }
}