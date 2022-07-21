class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = -1, b = -1;
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++)
        {
            if (!m.containsKey(nums[i]))
            m.put(nums[i],i);
        }
        for (int j=0; j<nums.length; j++)
        {
            int i = nums[j];
            int c = target - i;
            if (m.containsKey(c))
                if (m.get(c) != j)
            {
                a = j;
                b = m.get(c);
                
            }
        }
        return new int[] {b,a}; 
    }
}