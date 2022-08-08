class Solution {

    public int longestConsecutive(int[] nums) {
        if (nums.length<=0)
            return 0;
        
       Arrays.sort(nums);
        
        int max = 1;
        int cur = 1;
        
        for (int i=1; i<nums.length;i++)
        {
            if (nums[i] != nums[i-1])
            {
                if (nums[i] == nums[i-1]+1)
                {
                    cur++;
                }
                else
                {
                    max = Math.max(max,cur);
                    cur = 1;
                }
            }
        }
        //What if the longest streak never ends right - so it never goes to the else loop right.
        //That's why we do this.
        return Math.max(max,cur);
    }
}
