class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int x : nums)
        {
            if (set.contains(x))
                return x;
            else
                set.add(x);
        }
        return -1;
    }
}