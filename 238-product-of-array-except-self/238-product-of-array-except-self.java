class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,1);
        //We fill the whole array with the default value of 1
        
        //We get one variable called pref which keeps storing our future values
        int pref = 1;
        for (int i=0; i<nums.length; i++)
        {
            res[i] = pref;
            pref = pref * nums[i];
        }
        
        //We will again do the same but in reverse
        int post = 1;
        for (int i = nums.length - 1; i>=0; i--)
        {
            res[i] *= post;
            post = post * nums[i];
        }
        return res;
    }
}