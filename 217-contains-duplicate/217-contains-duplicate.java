class Solution {
    public boolean containsDuplicate(int[] nums) {
        // O(N^2)
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
        
        //O(NLogN)
        // Arrays.sort(nums);
        // for (int i=1; i<nums.length; i++)
        // {
        //     if (nums[i-1]==nums[i])
        //         return true;
        // }
        // return false;
        
        //O(N) TC + O(N) SC
        HashSet<Integer> set = new HashSet<Integer>();
        for (int x : nums)
        {
            if (set.contains(x))
                return true;
            set.add(x);
        }
        return false;
    }
}