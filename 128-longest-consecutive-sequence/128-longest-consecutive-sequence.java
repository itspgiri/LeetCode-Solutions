class Solution {

    public int longestConsecutive(int[] nums) {
     HashSet<Integer> set = new HashSet<Integer>();
        for (int x : nums)
            set.add(x);
        
        int max =0;
        
        for (int x : set)
        {
            if (!set.contains(x-1))
            {
                int no = x;
                int cur = 1;
                
                while (set.contains(x+1))
                {
                    cur++;
                    x++;
                }
                
                max = Math.max(max,cur);
            }
        }
        return max;
    }
}
