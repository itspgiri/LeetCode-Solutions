class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i=0; i<nums.length; i++)
        {
            int x = nums[i];
            int ans = k-x; 
            if (map.containsKey(ans))
                {
                    int x_count  = map.get(ans);
                    if(x_count == 1)
                    {
                        map.remove(ans);
                    }
                    else
                    {
                        map.put(ans , x_count-1);
                    }
                    count++;
                }
            else
                {
                    map.put(x, map.getOrDefault(x,0)+1);
                }
        }
        return count;
    }
}