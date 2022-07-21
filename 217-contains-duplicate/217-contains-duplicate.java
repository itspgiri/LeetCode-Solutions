class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int x : nums)
        {
            if (s.contains(x))
                return true;
            s.add(x);
        }
        return false;
    }
}