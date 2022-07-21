class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = -1, b = -1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++)
        {
            if (!map.containsKey(nums[i]))
            map.put(nums[i],i);
        }
        for (int j=0; j<nums.length; j++)
        {
            int i = nums[j];
            int c = target - i;
            if (map.containsKey(c))
                if (map.get(c) != j)
            {
                a = j;
                b = map.get(c);
                
            }
        }
        return new int[] {b,a}; 
    }
}