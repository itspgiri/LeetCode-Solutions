class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = 1;
        while (l < r) {
            int s = numbers[l] + numbers[r];
            if (s == target) return new int[] { l + 1, r + 1 }; 
            else if (s < target) {
                l++;
                r++;
            } else if (s > target) {
                l--;
            }
        }
        return null;
    }
}
