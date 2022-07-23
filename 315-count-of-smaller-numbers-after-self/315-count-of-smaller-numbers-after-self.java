class Solution {    
    public List<Integer> countSmaller(int[] nums) {
        int min = 20001;
        int max = -1;
        
        // Finding max and min in the array
        // And storing max min 
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        min--;
        
        int[] count = new int[max-min+1];
        
        Integer[] result = new Integer[nums.length];
        
        for (int i = nums.length-1; i >=0; i--) {
            
            int k = nums[i]-min-1;
            int c = 0;
            
            do {
                c = c + count[k];
                k = k - (-k&k);
            } while (k > 0);
            result[i] = c;
            
            k = nums[i]-min;
            while (k < count.length) {
                count[k]++;
                k += (-k&k);
            }
        }
        
        return Arrays.asList(result);
    }
}
