class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=1;
        while (l<r)
        {
            int a = numbers[l];
            int b = numbers[r];
            if (a+b == target)
                return new int[]{l+1,r+1};
            else if (a+b<target)
            {
                l++;
               r++;
            }
            else if (a+b>target)
            {
                l--;
            }    
        }
        return null;
    }
}