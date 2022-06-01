class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        for (int i=0; i<nums.length; i++)
        {
            int a = nums[i];
            if (a!=val)
            {
                nums[c]=nums[i];
                c++;
            }
        }
        return c;
    }
}