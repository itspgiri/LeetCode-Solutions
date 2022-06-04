class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int cur_sum = nums[0];
        for (int i=1; i<nums.length; i++)
        {
            cur_sum = Math.max(cur_sum+nums[i], nums[i]);
            max = Math.max(cur_sum, max);
        }
        return max;
    }
}