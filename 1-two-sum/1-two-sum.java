class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length;i++)
        {
                m.put(nums[i],i);
        }
        for (int i=0; i<nums.length;i++)
        {
            int c = target - nums[i];
            if (m.containsKey(c))
            {
            int d =m.get(c);
            if (d!=i)
            return new int[]{i,d};
            }
        }
        return null;
    }
}