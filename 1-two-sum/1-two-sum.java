class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length;i++)
        {
                map.put(nums[i],i);
        }
        System.out.println(map);
        for (int i=0; i<nums.length;i++)
        {
            int c = target - nums[i];
            if (map.containsKey(c))
            {
            int d = map.get(c);
            if (d!=i)
            return new int[]{i,d};
            }
        }
        return null;
    }
}