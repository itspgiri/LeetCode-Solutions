class Solution {
    public boolean isMonotonic(int[] nums) {
        int c = 0;
        for (int i=0; i<nums.length-1; i++)
        {
            if (nums[i] <= nums[i+1])
                c++;
        }
        if (c == nums.length-1)
        return true;
        
        c = 0;
        for (int i=0; i<nums.length-1; i++)
        {
            if (nums[i] >= nums[i+1])
                c++;
        }
        if (c == nums.length-1)
        return true;
        else
        return false;
    }
}