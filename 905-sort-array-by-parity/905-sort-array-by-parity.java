class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a = nums.length;
        int res[] = new int[a];
        int l =0;
        int r = a-1;
        for (int i =0; i<a; i++)
        {
          if (nums[i] % 2 == 0)
          {
              res[l] = nums[i];
                l++;
        }
            else
            {
                res[r] = nums[i];
            r--;
            }
        }
        return res;
    }
}