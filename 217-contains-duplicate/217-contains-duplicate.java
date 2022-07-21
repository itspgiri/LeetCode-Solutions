class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // for (int i=0;i<nums.length;i++)
        // {
        //     for (int j=0; j<nums.length; j++)
        //     {
        //         if (i!=j)
        //             if (nums[i] == nums[j])
        //                 return true;
        //     }
        // }
        // return false;
        
        Arrays.sort(nums);
        for (int i=1; i<nums.length; i++)
        {
            if (nums[i-1]==nums[i])
                return true;
        }
        return false;
    }
}