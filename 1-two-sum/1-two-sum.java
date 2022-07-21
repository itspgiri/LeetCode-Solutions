class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = -1, b = -1;
        for (int i=0; i<nums.length; i++)
        {
            for (int j=0; j<nums.length; j++)
            {
                if (i!=j)
                if (target == nums[i]+nums[j])
                {
                    a = i;
                    b = j;
                }
            }
        }
        return new int[] {a,b}; 
    }
}