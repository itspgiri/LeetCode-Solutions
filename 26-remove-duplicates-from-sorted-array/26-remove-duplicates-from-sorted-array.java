class Solution {
    public int removeDuplicates(int[] nums) {
        int c = 1;
        for (int i=1;i<nums.length;++i)
        {
            int n = nums[i];
            int m = nums[i-1];
            if (n!=m)
            {
                nums[c]=n;
                ++c;
            }
        }
        return c;
    }
}