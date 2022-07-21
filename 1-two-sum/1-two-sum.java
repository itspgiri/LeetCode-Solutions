class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (m.containsKey(complement)) {
                return new int[] { m.get(complement), i };
            }
            m.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}